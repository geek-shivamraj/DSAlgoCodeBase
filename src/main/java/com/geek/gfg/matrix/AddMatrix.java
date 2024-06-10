package com.geek.gfg.matrix;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1},{2, 2, 2}, {3, 3, 3}};
        int[][] matrix2 = {{9, 9, 9},{8, 8, 8}, {7, 7, 7}};
        int n = matrix1.length;
        findMatrixSum(matrix1, matrix2, n);
        for (int[] arr : matrix1) {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    private static void findMatrixSum(int[][] matrix1, int[][] matrix2, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                matrix1[i][j] += matrix2[i][j];
        }
    }
}
