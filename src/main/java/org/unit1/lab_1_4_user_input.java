package org.unit1_1;

import java.util.Scanner;

public class lab_1_4_user_input {
    static void print(String input){
        System.out.print(input);
    }

    public static void main(String[] args) {
        print("Hello!\nPlease enter your name, age, and the current temperature\n");
        print("Name > ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        print("Age > ");
        int age = input.nextInt();
        print("Current temperature (in Fahrenheit): ");
        float fTemp = input.nextFloat();
        float cTemp = (fTemp - 32) * 5/9f;

        int dogAge = age * 7;
        print("Hello, " + name + "; you are " + dogAge + " dog years old (" + age + " human years), and the current temperature is " + cTemp + " degrees Celsius.");
    }
}
