package com.company.day1.Shop2;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;

    Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;

    }

    void checkOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter name and count of product");
        String name = scanner.nextLine();
        int count = scanner.nextInt();
        if (this.name.equals(name) && count <= this.countOfProduct) {
            System.out.println("Yes, we have a product with that name and that count");
            System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom");
            int choice = scanner.nextInt();
            if (choice == 1) {
                calculateOrder(count);
       //         addShopBalance();
            }
        } else {
            System.out.println("Now we don’t have so much product,sorry ");
        }
    }

    void calculateOrder(int count) {
shopBalance+=count*priceForProduct;
        countOfProduct -= count;
    //    return count * this.priceForProduct;
    }

 /*   void addShopBalance() {
        this.shopBalance += calculateOrder(countOfProduct);
    }*/

    void print() {
        System.out.println("name:" + this.name + "  address: " + this.address + " coutnOfProduct:" + countOfProduct);
        System.out.println(" priceForProduct:" + this.priceForProduct + " shopBalance:" + shopBalance);
    }

}
