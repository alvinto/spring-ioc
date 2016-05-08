package com.ws.reflect;

/**
 * Created by alvin on 2016/5/8.
 */
public class Car {
    private String color;

    public void drive(){
        System.out.println("drive my car , the color is "+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
