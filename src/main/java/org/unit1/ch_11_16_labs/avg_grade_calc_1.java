package org.unit1.ch_11_16_labs;

public class avg_grade_calc_1 {
    public static void main(String[] args) {
        int grade1 = 100, grade2 = 90, grade3 = 97;
        int sum;
        double avg;

        sum = grade1 + grade2 + grade3;
        avg = sum / 3f;

        System.out.printf("Average of grades: %.2f%%\n", avg);
    }
}
