package com.allstate.models;

import java.util.List;

/**
 * Created by localadmin on 11/01/17.
 */
public class Geometry {
    private int x;
    private int y;


    public static double distance(List<Geometry> points) {
        int a = Maths.square(points.get(1).x - points.get(0).x);
        int b = Maths.square(points.get(1).y - points.get(0).y);
        return (Math.sqrt(a + b));
    }

    public static double Slope(List<Geometry> points){
        double a = points.get(1).x - points.get(0).x;
        double b = points.get(1).y - points.get(0).y;
        double d = (b/a);
        return (d);
    }

    public static double YIntercept(List<Geometry> points){
        double a = points.get(1).x;
        double b = points.get(1).y;
        double d = (b - (Geometry.Slope(points)*a));
        System.out.println(d);
        return d;
    }

    public Geometry(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

        
    }
}
