package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class GeometryTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ShouldReturnDistanceBwPoints() throws Exception {
        Geometry t1 = new Geometry(3, 4);
        Geometry t2 = new Geometry(6, 8);
        List<Geometry> points = new ArrayList<>();
        points.add(t1);
        points.add(t2);
        double result = Geometry.distance(points);
        assertEquals(5, result, 0.1);
    }

    @Test
    public void ShouldReturnSlopeOfPoints() throws Exception {
        Geometry t1 = new Geometry(-2, -1);
        Geometry t2 = new Geometry(4, 3);
        List<Geometry> points = new ArrayList<>();
        points.add(t1);
        points.add(t2);
        double result = Geometry.Slope(points);
        assertEquals(0.667, result, 0.01);
    }

    @Test
    public void ShouldReturnYInterceptOfPoints() throws Exception {
        Geometry t1 = new Geometry(3, 4);
        Geometry t2 = new Geometry(6, 8);
        List<Geometry> points = new ArrayList<>();
        points.add(t1);
        points.add(t2);
        double result = Geometry.YIntercept(points);
        assertEquals(0.0002, result, 0.01);
    }
}