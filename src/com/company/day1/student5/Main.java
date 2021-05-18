package com.company.day1.student5;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(20,"Karen",80);
        Student student2=new Student(18,"Armen",60);
        Student student3=new Student(30,"Samvel",70);
        Student student4=new Student(16,"Vazgen",100);
        Student student5=new Student(20,"Hunan",55);
        Student[] students = new Student[5];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;
        students[4]=student5;
        Sort sort = new Sort();
        sort.sortAge(students);
        sort.sortName(students);
        sort.sortWeight(students);
    }

    }
