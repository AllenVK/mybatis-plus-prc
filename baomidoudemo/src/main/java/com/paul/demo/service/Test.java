package com.paul.demo.service;

import com.alibaba.dcm.DnsCache;
import com.alibaba.dcm.DnsCacheEntry;
import com.alibaba.dcm.DnsCacheManipulator;
import sun.net.www.http.HttpClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/**
 * Date: 2023-05-09 21:20
 * Author: Paul
 */
public class Test {

    public static void main(String[] args) throws UnknownHostException {
        DnsCacheManipulator.setDnsCache("www.hello.com", "192.168.1.1");
        DnsCacheManipulator.setDnsCache("www.world.com", "1234:5678:0:0:0:0:0:200e");
        DnsCacheManipulator.setDnsCache("api.xx.xxx.x", InetAddress.getLocalHost().getHostAddress());
        // 支持IPv6地址
        // 之后Java代码中使用到域名都会解析成上面指定的IP。
        // 下面是一个简单获取域名对应的IP，演示一下：
        String ip = InetAddress.getByName("www.hello.com").getHostAddress(); // ip = "192.168.1.1"
        String ipv6 = InetAddress.getByName("www.world.com").getHostAddress(); // ipv6 = "1234:5678:0:0:0:0:0:200e"

        DnsCache dnsCache = DnsCacheManipulator.getWholeDnsCache();
        System.out.println(dnsCache);
        List<DnsCacheEntry> cache = dnsCache.getCache();
        for (DnsCacheEntry dnsCacheEntry : cache) {
            System.out.println("host:" + dnsCacheEntry.getHost());
            System.out.println("ip:" + dnsCacheEntry.getIp());
            System.out.println("ex:" + dnsCacheEntry.getExpiration());
            System.out.println("ips:" + Arrays.toString(dnsCacheEntry.getIps()));
            System.out.println("======");
        }
    }

}
