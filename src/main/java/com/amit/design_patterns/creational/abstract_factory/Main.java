package main.java.com.amit.design_patterns.creational.abstract_factory;

import main.java.com.amit.design_patterns.creational.abstract_factory.model.British;
import main.java.com.amit.design_patterns.creational.abstract_factory.model.Furniture;
import main.java.com.amit.design_patterns.creational.abstract_factory.model.Victorian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory");

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Furniture f = null;

        if (s.equals("VT")) {
            f = new Victorian();
            System.out.println(f.createTable());
        } else if (s.equals("BS")) {
            f = new British();
            System.out.println(f.createTable());
        }
    }
}
