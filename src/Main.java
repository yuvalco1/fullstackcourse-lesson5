import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // get number from user. print sum of it digits
        // Example: 1234 -> 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number:");
        int input_number = scanner.nextInt();
        int sum_digits = 0;
        while (input_number > 0) {
            sum_digits += input_number % 10;
            input_number /= 10;
        }
        System.out.println("sum of digits is: " + sum_digits);

        // Exercise 2 - print 1234 , 234, 34, 4
        //Scanner scanner = new Scanner(System.in);
        System.out.println("please enter positive number:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(j + 1 + ",");
            }
            System.out.println(n);
        }

        String[] cars = {"BMW", "Pegout", "SERES", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] numbers = {7, 15, 3, 22, 10, 9, 14, 6};
        float sum = 0;
        float average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println("Average is: " + average);
        // example for "for each loop"
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("minimum nuber in array is:" + min);

        // 2d array

        int[][] nums2d = {{3,4,5,6},{7,8,9}};
        int sum2d =0;
        for(int i=0; i< nums2d.length; i++){
            for(int j=0; j <nums2d[i].length; j++){
                sum2d += nums2d[i][j];
            }
        }
        System.out.println("Sum of 2d array is: "+sum2d);


        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int matrixsum = 0;

        for (int i=0; i< squareMatrix.length; i++){
            matrixsum += squareMatrix[i][i];
        }
        System.out.println("Sum of diagonal in matrix is: "+matrixsum);
        
        
        String [][] matrix2 ={{"a", "b", "c"},   {"d", "e", "f"},  {"g", "h", "i","e"}};
        int counte = 0;

        for (String[] row:matrix2) {
            for (String el: row) {
                if (el == "e"){
                    counte +=1;
                }
            }
        }
        System.out.println("the number of occurance of e in the matirx is: "+counte);





    }
}