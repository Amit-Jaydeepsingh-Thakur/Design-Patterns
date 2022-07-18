package main.java.com.amit.design_patterns.behavioural.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Strategy Pattern");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the src, dest, pattern");
        String src = sc.next();
        String dest = sc.next();
        String pattern = sc.next();

        Route r = null;

        if (pattern.equals("Road")) {
            r = new Road();
        } else if (pattern.equals("Cycle")) {
            r = new Cycle();
        } else if (pattern.equals("Walk")) {
            r = new Walk();
        } else {
            throw new Exception("The input is not correct");
        }

        r.buildRoute(src, dest);
    }
}
