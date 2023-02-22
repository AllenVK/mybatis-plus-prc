package com.paul.demo;

import com.alibaba.fastjson.JSON;
import com.paul.demo.util.JavaJsoupUtil;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Date: 2023-02-22 10:47
 * Author: Paul
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSome {

    @Test
    public void cityTest() {
        JavaJsoupUtil util = new JavaJsoupUtil();
        List<JavaJsoupUtil.SysCitys> sysAreas = util.getProvinces();
        System.out.println(sysAreas.size());
        System.err.println("爬虫相应数据为：" + JSON.toJSONString(sysAreas));
    }

}
