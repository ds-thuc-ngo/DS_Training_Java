package arrays;

import java.util.Arrays;

public class Arrays12 {
    public static void main(String[] args) {

        //Mảng 1 chiều
        int[] numbers = new int[6];
        for (int i = 1; i <= 5; i++) {
            numbers[i] = 6-i;
            System.out.println("number " + i + " = " + numbers[i]);
        }
        Arrays.sort(numbers);
        System.out.println("After sort:");
        for(int i = 1; i <= 5; i++) {
            System.out.println("number " + i + " = " + numbers[i]);
        }

        //Mảng 2 chiều
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
