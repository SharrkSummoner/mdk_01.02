package com.company;

public class arr {
    public arr(String[] args) {
        int n = 100, i, sum = 0;
        int[] array = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = (int)Math.round((Math.random() * 1000) - 500);
        }

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.printf("%d", sum);
    }
}
