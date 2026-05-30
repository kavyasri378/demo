package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton") //s1 and s2 points to same object as springboot is singleton by default
public class Student {
    int age;
//    public void study(){
//        System.out.println("I am doing Engineering");
//    }

    //Field Injection
    //@Autowired
    //Pen p;
//    public void writeExam(){
//        p.write();
//    }

    //Constructor injection
//    @Autowired
//    Pen p;
//    public Student(Pen p){
//        this.p=p;
//    }

    //setter injection
//    @Autowired
//    Pen p;
//    public void setP(Pen p){
//        this.p=p;
//    }

    Pen p;
    @Autowired
    public void setP(Pen p) {
        this.p = p;
    }

    @Autowired
    @Qualifier("Pencil")
    Writer w;
    public void study(){
        System.out.println("I am doing Engineering");
    }
    public void writeExam(){
        p.write();
    }
}