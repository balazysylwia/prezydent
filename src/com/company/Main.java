package com.company;

/*public class Main {

    public static void main(String[] args) {
        President p = President.getPresident();
        System.out.println(p.getAge());
        President p2 = President.getPresident();
        p2.setAge(53);
        System.out.println(p.getAge());
    }
}*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String shapeList[] = {"Circle", "Square", "Square", "Circle", "Circle", "Square", "Triangle"};
        List<Shape> shapes = new ArrayList();
        for (String s : shapeList) {
            shapes.add(Shape.create(s));
        }
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            Shape s = (Shape) it.next();
            s.draw();
            s.erase();
        }
    }
}
