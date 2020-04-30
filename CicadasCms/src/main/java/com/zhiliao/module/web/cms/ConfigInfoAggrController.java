package com.zhiliao.module.web.cms;
import com.zhiliao.mybatis.model.ConfigInfoAggr;
import com.zhiliao.module.web.cms.service.ConfigInfoAggrService;
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
@RequestMapping("/configInfoAggr/")
public class ConfigInfoAggrController {
    private final static Logger log = LoggerFactory.getLogger(ConfigInfoAggrController.class);

    @Autowired
    ConfigInfoAggrService configInfoAggrService;

  /**
  * 增加
  * @param </T>
  * @return Json
  */
@ApiOperation("ConfigInfoAggr 增加")
    @PostMapping("add")
    @ResponseBody
    public Map add(ConfigInfoAggr configInfoAggr) {
         try {
             configInfoAggrService.save(configInfoAggr);
         } catch (Exception e) {
          log.error("ConfigInfoAggrController add方法异常",e.getMessage());
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
    @ApiOperation("ConfigInfoAggr 删除")
    @GetMapping("delete")
    @ResponseBody
    public Map delete(@RequestParam Integer id) {
        try {
            configInfoAggrService.deleteById(id);
        } catch (Exception e) {
             log.error("ConfigInfoAggrController delete方法异常",e.getMessage());
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
    @ApiOperation("ConfigInfoAggr 修改")
    @PostMapping("update")
    @ResponseBody
    public Map update(ConfigInfoAggr configInfoAggr) {

        try {
            configInfoAggrService.update(configInfoAggr);
        } catch (Exception e) {
            log.error("ConfigInfoAggrController delete方法异常",e.getMessage());
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
    public ConfigInfoAggr detail(@RequestParam Integer id) {
        ConfigInfoAggr configInfoAggr = configInfoAggrService.findById(id);
        return configInfoAggr;
    }

        /**
        * 根据id查询
        * @param id
        * @return Json
        */
        @ApiOperation("ConfigInfoAggr 根据id 查询")
        @GetMapping("detailToJson")
        @ResponseBody
        public String detailToJson(@RequestParam Integer id) {
        ConfigInfoAggr configInfoAggr = configInfoAggrService.findById(id);
             return configInfoAggr.toString();
        }

    /**
    * 查询所有Json
    * @param pageNumber
    * @param pageSize
    * @return Json
    */
    @ApiOperation("ConfigInfoAggr 查询全部")
    @GetMapping("listToJson")
    @ResponseBody
    public String listToJson( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<ConfigInfoAggr> list = configInfoAggrService.findAll();
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
        public List<ConfigInfoAggr> list( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
                  PageHelper.startPage(pageNumber, pageSize);
                  List<ConfigInfoAggr> list = configInfoAggrService.findAll();
                  PageInfo pageInfo = new PageInfo(list);
                  return pageInfo.getList();
        }
}
