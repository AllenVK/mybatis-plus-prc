package com.paul.demo.controller;

import com.alibaba.fastjson.JSON;
import com.paul.demo.util.JavaJsoupUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date: 2023-02-22 9:46
 * Author: Paul
 */
@RestController
@RequestMapping(value = "/test")
public class PCAAccessController {

    @RequestMapping(value = "/getPCA")
    public String getPCA() {
        JavaJsoupUtil util = new JavaJsoupUtil();
        List<JavaJsoupUtil.SysCitys> sysAreas = util.getProvinces();
        return JSON.toJSONString(sysAreas);
    }

}
