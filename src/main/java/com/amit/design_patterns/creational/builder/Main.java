package main.java.com.amit.design_patterns.creational.builder;

import main.java.com.amit.design_patterns.creational.builder.common.Director;
import main.java.com.amit.design_patterns.creational.builder.model.Builder;
import main.java.com.amit.design_patterns.creational.builder.model.CarBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Builder Design Pattern");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        CarBuilder builder = new CarBuilder();

        if (s.equals("hatchback")) {
            Director d = new Director(builder);
            d.constructHatchback();
            builder.getResult();
        } else if (s.equals("sedan")) {
            Director d = new Director(builder);
            d.constructSedan();
            builder.getResult();
        } else if (s.equals("SUV")) {
            Director d = new Director(builder);
            d.constructSUV();
            builder.getResult();
        } else if (s.equals("MUV")) {
            Director d = new Director(builder);
            d.constructMUV();
            builder.getResult();
        } else {
            throw new Exception("Invalid car Type provided");
        }
    }
}
