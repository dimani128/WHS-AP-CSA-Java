package org.unit1.ch_11_16_labs;

import java.util.Arrays;

public class avg_grade_calc_1_advanced {
    public static void main(String[] args) {
        int[] grades = {100, 97, 89};
        int sum = Arrays.stream(grades).sum();
        double avg = (double) sum / grades.length;
        System.out.printf("Average of %d grades: %.2f%%\n", grades.length, avg);
    }
}
