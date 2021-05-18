package com.company.day1.Employer1;

public class Employer {
    String name;
    int age;
    String workPlace;
    int salary;


    Employer()
    {

    }


    Employer(String name,int age,String workPlace,int salary){
        this.name=name;
        this.age=age;
        this.workPlace=workPlace;
        this.salary=salary;
    }

    void print()
    {
        System.out.println("Name: " + this.name + "  Age: " + this.age);
        System.out.println("WorkPlace: " + this.workPlace + " Salary: " + this.salary);
    }
}
