package org.example;

public class HelloUC7 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "Hello " + String.join(", ", args);

        System.out.println(result);
    }
}
