package com.ws.spring.resourceUtil;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * Created by alvin on 2016/5/8.
 */
public class ResourceUtilTest {
    public static void main(String[] args) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource resource[] = resolver.getResources("classpath*:*.txt");
            for(Resource resource1 : resource){
                System.out.println(resource1.getDescription());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
