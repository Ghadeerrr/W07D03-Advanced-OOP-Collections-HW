package com.company;

//Inherits the variables and methods from the superclass Circle.
public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;

    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
