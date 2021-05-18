package com.company.day1.Arithmetic4;


import java.util.Scanner;

public class Arithmetic {
    int[] array;
Scanner scanner=new Scanner(System.in);

    public Arithmetic(int[] array)
    {
        this.array = array;
    }

    public void  option() {
        System.out.println("enter 1 to bubble sort or enter 2 to binarySearch ");
        int number = scanner.nextInt();
        if (number == 1) {
            bubbleSort(array);
        }
        else if(number==2)

        {
           /* System.out.println("enter number for binary search");
            int num= scanner.nextInt();*/
            binarySearch();
        }
        else
            System.out.println("enter valid number 1 or 2 ");

    }
    public void bubbleSort(int[]array)
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public  void binarySearch()
    {
       bubbleSort(array);
        System.out.println("input number search in array");
     int number= scanner.nextInt();
       int left=0;int right=array[array.length-1];int j=0;
       while (number!=array[j]) {
           for (j = 0; j < array.length; j++) {
               if (number > array[j]) {
                   left = (left + right) / 2 + 1;
               } else {
                   right = (left + right) / 2 - 1;
               }
           }
       }
        System.out.println("number= " + number + " index=" + j);
    }
}