package com.starkyy.firebaseapp;

public class Data
{
    private String name;
    private String roll;
    private String course;
    public Data(String s){}

    public Data(String name, String roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
