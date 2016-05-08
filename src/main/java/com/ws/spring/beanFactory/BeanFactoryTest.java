package com.ws.spring.beanFactory;

import com.ws.reflect.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 通过XmlBeanFactory实现类启动SpringIOC容器
 * Created by alvin on 2016/5/8.
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource resource = resolver.getResource("/bean.xml");
        Resource resource = resolver.getResource("classpath:bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Car car = beanFactory.getBean("car",Car.class);

        car.drive();
    }
}
