package org.example;

public class HelloUC6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "Hello ";

        for (String name : args) {
            result += name + ", ";
        }

        result = result.substring(0, result.length() - 2);

        System.out.println(result);
    }
}
