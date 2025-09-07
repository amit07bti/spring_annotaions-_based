package com.edusol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Amit kumar")
    private String name;
    @Value("101")
    private  int rollNo;
    @Value("234.67f")
    private  float marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void  display(){
        System.out.println("Name:   "+name);
        System.out.println("RollNumber:  "+rollNo);
        System.out.println("Marks:    "+marks);
    }
}
