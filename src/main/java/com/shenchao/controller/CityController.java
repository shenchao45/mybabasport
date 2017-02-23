package com.shenchao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenchao.entity.City;
import com.shenchao.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shenchao on 2017/2/7.
 */
@Controller
public class CityController {
    @Autowired
    private CityMapper cityMapper;

    @PostMapping("testRequest")
    @ResponseBody
    public City testRequest(@RequestBody City city) {
        city.setState(city.getState()+"111");
        System.out.println(city);
        return city;
    }

   @Transactional
    @RequestMapping("testSave")
    @ResponseBody
    public City save() {
        City city = new City();
        city.setName("沈超1");
        city.setState("不正常");
        cityMapper.save(city);
        return city;
    }
    @RequestMapping("testFind")
    @ResponseBody
    public City testFind(){
        City hah = cityMapper.findByState("不正常");
        return hah;
    }
    @RequestMapping("testDelete")
    @ResponseBody
    public String testDelete(){
        cityMapper.testDelete(3);
        return "删除成功";
    }
    @GetMapping("findAll")
    @ResponseBody
    public PageInfo<City> findAll(@RequestParam(name = "pageNo",defaultValue = "0") int pageNo,@RequestParam(name = "pageSize",defaultValue = "2")int pageSize){
        PageHelper.startPage(pageNo, pageSize);
        PageInfo<City> pageInfo = new PageInfo<>(cityMapper.findAll());
        return pageInfo;
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name", "沈超");
        return "index";
    }
}
