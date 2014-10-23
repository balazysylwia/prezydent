package com.company;

public class Main {

    public static void main(String[] args) {
        President p = President.getPresident();
        System.out.println(p.getAge());
        President p2 = President.getPresident();
        p2.setAge(53);
        System.out.println(p.getAge());
    }
}
