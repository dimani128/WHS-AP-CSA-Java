package org.unit1.ch_11_16_labs;

import java.util.Scanner;

public class reversing_number_2 {
    public static void main(String[] args) {
        System.out.print("Please enter a number\n > ");
        int number = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            number = input.nextInt();
            if (!(number > 0)) {
                System.out.println("Please enter a positive integer.\n > ");
                continue;
            }
            break;
        }

        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
