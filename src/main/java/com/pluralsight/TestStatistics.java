
package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 95, 70, 82, 91, 89};

        int total = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            total += score;

            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }

        double average = (double) total / scores.length;

        System.out.println("Average: " + average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);
    }
}
