package com.matrix;

public class UpperTriangle {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        boolean isUpper = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {  
                if (a[i][j] != 0) {
                    isUpper = false;
                }
            }
        }

        System.out.println(isUpper ? "Upper Triangular" : "Not Upper Triangular");
    }
}