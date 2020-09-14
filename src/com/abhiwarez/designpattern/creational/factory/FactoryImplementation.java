package com.abhiwarez.designpattern.creational.factory;



public class FactoryImplementation {
    public static void main(String[] args) {
        GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("This shape can not be drawn.");
        }
        GeometricShape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) {
            triangle.draw();
        } else {
            System.out.println("This shape can't be drawn");
        }
    }
}