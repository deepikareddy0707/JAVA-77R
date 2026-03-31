package com.matrix;

public class LowerTriangle {
	    public static void main(String[] args) {

	        int[][] a = {
	            {1, 0, 0},
	            {2, 3, 0},
	            {4, 5, 6}
	        };

	        boolean isLower = true;

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++) {

	                if (i < j && a[i][j] != 0) {  
	                    isLower = false;
	                }

	            }
	        }

	        System.out.println(isLower ? "Lower Triangular" : "Not Lower Triangular");
	    }
	}