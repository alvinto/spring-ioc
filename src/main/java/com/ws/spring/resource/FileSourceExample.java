package com.ws.spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 访问一个位于web容器下的文件
 * FileSystemResource
 * ClassPathResource
 * ServletContextResource
 * Created by alvin on 2016/5/8.
 */
public class FileSourceExample {
    public static void main(String[] args) {
        //使用系统文件路径方式加载文件
        Resource resource1 = new FileSystemResource("D:/ideaworkspace/spring-all/spring-ioc/src/main/resources/file1.txt");
        //通过类路径方式加载文件
        Resource resource2 = new ClassPathResource("/file1.txt");

        try {

            System.out.println(resource1.getFilename()+"---"+resource2.getFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
