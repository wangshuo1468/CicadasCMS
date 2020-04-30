package com.zhiliao.module.web.cms;
import com.zhiliao.mybatis.model.ConfigInfo;
import com.zhiliao.module.web.cms.service.ConfigInfoService;
import com.zhiliao.common.utils.JsonUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import io.swagger.annotations.ApiOperation;


import java.util.List;
import java.util.Map;

/**
 *
 * Created by çç¡ on 2020/04/30.
 */
@Controller
@RequestMapping("/configInfo/")
public class ConfigInfoController {
    private final static Logger log = LoggerFactory.getLogger(ConfigInfoController.class);

    @Autowired
    ConfigInfoService configInfoService;

  /**
  * 增加
  * @param </T>
  * @return Json
  */
@ApiOperation("ConfigInfo 增加")
    @PostMapping("add")
    @ResponseBody
    public Map add(ConfigInfo configInfo) {
         try {
             configInfoService.save(configInfo);
         } catch (Exception e) {
          log.error("ConfigInfoController add方法异常",e.getMessage());
           e.printStackTrace();
          return JsonUtil.toMAP(false, "操作失败");
        }
          return JsonUtil.toMAP(true, "操作成功");
    }


    /**
    * 删除
    * @param id
    * @return Json
    */
    @ApiOperation("ConfigInfo 删除")
    @GetMapping("delete")
    @ResponseBody
    public Map delete(@RequestParam Integer id) {
        try {
            configInfoService.deleteById(id);
        } catch (Exception e) {
             log.error("ConfigInfoController delete方法异常",e.getMessage());
            e.printStackTrace();
        return JsonUtil.toMAP(false, "删除失败");
        }
         return JsonUtil.toMAP(true, "删除成功");
    }
    /**
    * 修改
    * @param </T>
    * @return Json
    */
    @ApiOperation("ConfigInfo 修改")
    @PostMapping("update")
    @ResponseBody
    public Map update(ConfigInfo configInfo) {

        try {
            configInfoService.update(configInfo);
        } catch (Exception e) {
            log.error("ConfigInfoController delete方法异常",e.getMessage());
                e.printStackTrace();
            return JsonUtil.toMAP(false, "修改失败");
        }
            return JsonUtil.toMAP(true, "修改成功");
    }

    /**
    * 根据id查询
    * @param id
    * @return Json
    */
    @GetMapping("detail")
    public ConfigInfo detail(@RequestParam Integer id) {
        ConfigInfo configInfo = configInfoService.findById(id);
        return configInfo;
    }

        /**
        * 根据id查询
        * @param id
        * @return Json
        */
        @ApiOperation("ConfigInfo 根据id 查询")
        @GetMapping("detailToJson")
        @ResponseBody
        public String detailToJson(@RequestParam Integer id) {
        ConfigInfo configInfo = configInfoService.findById(id);
             return configInfo.toString();
        }

    /**
    * 查询所有Json
    * @param pageNumber
    * @param pageSize
    * @return Json
    */
    @ApiOperation("ConfigInfo 查询全部")
    @GetMapping("listToJson")
    @ResponseBody
    public String listToJson( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<ConfigInfo> list = configInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return JsonUtil.toSuccessResultJSON("请求成功",pageInfo.getList());
    }

        /**
        * 查询所有
        * @param pageNumber
        * @param pageSize
        * @return List
        */
        @GetMapping("list")
        public List<ConfigInfo> list( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
                  PageHelper.startPage(pageNumber, pageSize);
                  List<ConfigInfo> list = configInfoService.findAll();
                  PageInfo pageInfo = new PageInfo(list);
                  return pageInfo.getList();
        }
}
