package com.allstate.models;


import java.util.List;

public class Triangle {
    private int height;
    private int width;


    public static double area(List<Triangle> triangle) {
        return (triangle.get(0).getArea() + triangle.get(1).getArea());
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Triangle() {
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public double getArea(){
        return  this.height * this.width * 0.5;
    }
}
