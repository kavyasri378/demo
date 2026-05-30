package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")
public class Student {
    //int age;
    //<----field injection-->
    @Autowired
    Pen p;

    //<--constructor injection--->
    //    Pen p;
    //    @Autowired
    //    public Student(Pen p) {
    //        this.p = p;
    //    }

    //<--setter injection-->
    //    Pen p;
    //    @Autowired
    //    public void setP(Pen p) {
    //        this.p = p;
    //    }

    public void study(){
        System.out.println("I am doing Engineering");
    }

    public void writeexam(){
        p.write();
    }
    //constructor
    public Student(){
        System.out.println("Student Object has created");
    }
}