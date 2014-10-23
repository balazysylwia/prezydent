package com.company;

import java.util.Calendar;

public class President {
    private static President p;
    private int age;
    // constructor is private!
    public President(int age) {
        this.age = age;
    }
    public static President getPresident() {
        if (p == null) p = new President(62);
        return p;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class PresidentAdapter extends President implements Person{
    public int rok;
    President p = President.getPresident();

    public int getYearOfBirth() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        rok = year - p.getAge();
        return rok;
    }
}
