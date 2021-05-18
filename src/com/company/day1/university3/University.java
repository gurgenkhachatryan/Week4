package com.company.day1.university3;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudents;
    int minAgeOfStudents;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudents = maxAgeOfStudents;
        this.minAgeOfStudents = minAgeOfStudents;
    }


    public void printInfo() {
        System.out.print("Name: " + this.name + " countOfStudents :" + this.countOfStudents + " maxcountOfStudents: " + maxCountOfStudents);
        System.out.println(" maxAgeOfStudents=" + maxAgeOfStudents + " minAgeOfStudents:" + minAgeOfStudents);
    }

    public void Age() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        int age = scanner.nextInt();
        if (age >= this.minAgeOfStudents && age <= this.maxAgeOfStudents) {
            System.out.println("age in valid");
        } else {
            System.out.println("age in invalid");
        }
    }

    public void admission() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("courses your university please Enter 1 to Applied Mathematics");
        System.out.println("Enter 2 Computer science ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("your choice in Applied Mathematics");
                register();
                break;
            }
            case 2: {
                System.out.println("your choice in Computer science");
                register();
                break;
            }
            default:

        }
    }
    public void register()
    {
        this.countOfStudents++;
    }
public  void display()
{
    System.out.println("Name :" + this.name + "  countOfStudents:" + this.countOfStudents);
}

}
