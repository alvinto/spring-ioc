package com.ws.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by alvin on 2016/5/8.
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Class clazz = classLoader.loadClass("com.ws.reflect.Car");

            Car car = (Car)clazz.newInstance();

            Field field = clazz.getDeclaredField("color");
            field.setAccessible(true);
            field.set(car,"红色");

            Method method = clazz.getDeclaredMethod("drive",(Class[]) null);
            method.invoke(car,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
