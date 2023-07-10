package com.dipesh.oops.inheritance;

public class MethodOverriding {

    public static void main(String[] args) {

        Circle c = new Circle(2.0f);
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Cylinder cyl = new Cylinder(3.2f, 4.8f);
        System.out.println(cyl.area());
        System.out.println(cyl.perimeter());

//        Circle c2 = new Cylinder(3.2f, 4.8f);
//        System.out.println(c2.area());
//        System.out.println(c2.perimeter());
//        // here we can't access method of subclass as reference is of super class
////        System.out.println(c2.surfaceArea());

    }
    static class Circle {
        private float radius;

        public Circle(float radius) {
            this.radius = radius;
        }
        public double area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // cylinder class is inheriting the circle class
    static class Cylinder extends Circle {
        private float height;

        public Cylinder(float radius, float height) {
            super(radius);
            this.height = height;
        }
        @Override
        public double perimeter() {
            return (2 * (super.perimeter() + height));
        }
        @Override
        public double area() {
            return ((2 * super.area()) + (super.perimeter()*height));
        }
    }
}



