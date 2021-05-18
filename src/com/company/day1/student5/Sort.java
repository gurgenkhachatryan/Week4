package com.company.day1.student5;

public class Sort {
    void sortAge(Student[] array) {

        int mij;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].age > array[j + 1].age) {
                    mij = array[j].age;
                    array[j].age = array[j + 1].age;
                    array[j + 1].age = mij;
                }
            }
        }
        System.out.println();
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i].age + " ");
        }
    }

    void sortWeight(Student[] array) {

        int mij;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].weight > array[j + 1].weight) {
                    mij = array[j].weight;
                    array[j].weight = array[j + 1].weight;
                    array[j + 1].weight = mij;
                }
            }
        }
        System.out.println();
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i].weight + " ");
        }
    }

    void sortName(Student[] array) {

        String mij;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].name.compareTo(array[j + 1].name)>0) {
                    mij = array[j].name;
                    array[j].name = array[j + 1].name;
                    array[j + 1].name = mij;
                }
            }
        }
        System.out.println();
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i].name + " ");
        }
    }
}
