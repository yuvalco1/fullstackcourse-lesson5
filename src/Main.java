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
        for (int i=0;i <n ;i++){
            for (int j=i; j<n-1 ; j++){
                System.out.print(j+1+",");
            }
            System.out.println(n);
        }


    }
}