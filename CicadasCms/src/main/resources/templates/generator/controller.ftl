<#--package ${basePackage}.${sign};-->
package ${basePackage};
import ${modelPackage}.${modelNameUpperCamel};
import ${servicePackage}.${modelNameUpperCamel}Service;
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
 * Created by ${author} on ${date}.
 */
@Controller
@RequestMapping("/${baseRequestMapping}/")
public class ${modelNameUpperCamel}Controller {
    private final static Logger log = LoggerFactory.getLogger(${modelNameUpperCamel}Controller.class);

    @Autowired
    ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

  /**
  * 增加
  * @param </T>
  * @return Json
  */
    @ApiOperation("${modelNameUpperCamel} 增加")
    @PostMapping("add")
    @ResponseBody
    public Map add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
         try {
             ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
         } catch (Exception e) {
          log.error("${modelNameUpperCamel}Controller add方法异常",e.getMessage());
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
    @ApiOperation("${modelNameUpperCamel} 删除")
    @GetMapping("delete")
    @ResponseBody
    public Map delete(@RequestParam Integer id) {
        try {
            ${modelNameLowerCamel}Service.deleteById(id);
        } catch (Exception e) {
             log.error("${modelNameUpperCamel}Controller delete方法异常",e.getMessage());
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
    @ApiOperation("${modelNameUpperCamel} 修改")
    @PostMapping("update")
    @ResponseBody
    public Map update(${modelNameUpperCamel} ${modelNameLowerCamel}) {

        try {
            ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
        } catch (Exception e) {
            log.error("${modelNameUpperCamel}Controller delete方法异常",e.getMessage());
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
    @ApiIgnore
    @GetMapping("detail")
    public ${modelNameUpperCamel} detail(@RequestParam Integer id) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
        return ${modelNameLowerCamel};
    }

        /**
        * 根据id查询
        * @param id
        * @return Json
        */
        @ApiOperation("${modelNameUpperCamel} 根据id 查询")
        @GetMapping("detailToJson")
        @ResponseBody
        public String detailToJson(@RequestParam Integer id) {
             ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
             return ${modelNameLowerCamel}.toString();
        }

    /**
    * 查询所有Json
    * @param pageNumber
    * @param pageSize
    * @return Json
    */
    @ApiOperation("${modelNameUpperCamel} 查询全部")
    @GetMapping("listToJson")
    @ResponseBody
    public String listToJson( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
             PageHelper.startPage(pageNumber, pageSize);
             List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
             PageInfo pageInfo = new PageInfo(list);
             return JsonUtil.toSuccessResultJSON("请求成功",pageInfo.getList());
    }

        /**
        * 查询所有
        * @param pageNumber
        * @param pageSize
        * @return List
        */
        @ApiIgnore
        @GetMapping("list")
        public List<${modelNameUpperCamel}> list( @RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
                  PageHelper.startPage(pageNumber, pageSize);
                  List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
                  PageInfo pageInfo = new PageInfo(list);
                  return pageInfo.getList();
        }
}
