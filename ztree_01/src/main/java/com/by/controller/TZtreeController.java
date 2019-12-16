package com.by.controller;

import com.by.entity.TZtree;
import com.by.service.TZtreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TZtree)表控制层
 *
 * @author makejava
 * @since 2019-12-05 10:14:52
 */
@Controller
public class TZtreeController {
    /**
     * 服务对象
     */
    @Resource
    private TZtreeService tZtreeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TZtree selectOne(Integer id) {
        return this.tZtreeService.queryById(id);
    }




    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("selectAll")
    public List<TZtree> selectAll(Integer page,Integer limit){
        List<TZtree> list = tZtreeService.queryAllByLimit(0,1000);
        System.out.println(list);
        return list;
    }

    @ResponseBody
    @RequestMapping("deleteById")
    public String deleteById(Integer id){

        try {
            tZtreeService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("updateById")
    public String updateById(TZtree tZtree){
        try {
            tZtreeService.update(tZtree);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }


    @ResponseBody
    @RequestMapping("addPid")
    public String addPid(TZtree tZtree){

        try {
            tZtreeService.insert(tZtree);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @ResponseBody
    @RequestMapping("drugFu")
    public String drugFu(TZtree tZtree){
        if (tZtree.getPid()==null){
            tZtree.setPid(0);
        }
        tZtreeService.update(tZtree);
        return "success";
    }

    @ResponseBody
    @RequestMapping("dragZi")
    public String dragZi(TZtree tZtree){
        if (tZtree.getPid()==null){
            tZtree.setPid(0);
        }
        tZtreeService.update(tZtree);
        return "success";
    }

}