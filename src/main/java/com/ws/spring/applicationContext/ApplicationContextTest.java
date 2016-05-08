package com.ws.spring.applicationContext;

import com.ws.reflect.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 通过ClassPathXmlApplicationContext、FileSystemXmlApplicationContext加载配置文件得到bean实例
 * Created by alvin on 2016/5/8.
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");
        Car car = (Car)applicationContext.getBean("car");

        car.drive();
    }
}
