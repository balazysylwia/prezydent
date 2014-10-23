package com.company;


abstract class Shape {
    public abstract void draw();
    public abstract void erase();
    public static Shape create(String type) {
        if (type.equals("Circle"))
            return new Circle();
        if (type.equals("Square"))
            return new Square();
        throw new RuntimeException(
                "Bad shape creation: " + type);
    }
}

class Circle extends Shape {
    Circle() {
    } // Package-access constructor
    public void draw() {
        System.out.println("Circle.draw");
    }
    public void erase() {
        System.out.println("Circle.erase");
    }
}

class Square extends Shape {
    Square() {
    } // Package-access constructor
    public void draw() {
        System.out.println("Square.draw");
    }
    public void erase() {
        System.out.println("Square.erase");
    }
}