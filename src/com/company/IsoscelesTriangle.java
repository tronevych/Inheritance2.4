/*
 *
 * Classname: Rectangle
 *
 * 07 June 2020
 *
 * Copyright Serhii Tronevych KNUTE
 *
 * Module 2 task 2
 *
 * Create a child  from the class Rectangle.
 * Create another class as a super class for your one.
 * Or create a daughterly class for your one.
 */

package com.company;

public class IsoscelesTriangle extends Triangle {
    private double SideA;
    private double SideB;

    // Counstructor for class
    public IsoscelesTriangle(int sideA, int sideB) {
        super(sideA, sideA, sideB);
        SideA = sideA;
        SideB = sideB;
    }

// Getters and Setters

    @Override
    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    @Override
    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    // toString
    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "SideA=" + SideA +
                ", SideB=" + SideB +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                ", is Equilateraltriangle = " + isEquilateraltriangle() +
                ", is Iquilateraltriangle = " + isIquilateraltriangle() +
                '}';
    }
}
