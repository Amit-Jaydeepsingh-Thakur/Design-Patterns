package main.java.com.amit.design_patterns.creational.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Vehicle v = null;
        Transportation type;

        if (s.equals("sea")) {
            type = new Seaways();
        } else {
            type = new Roadways();
        }

        System.out.println("The output transport media is :- ");
        System.out.println(type.transportMedia());
    }
}
