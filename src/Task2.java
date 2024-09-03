import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size (<=500): ");
        int n = sc.nextInt();
        if (n > 500) {
            System.out.println("Array size is too big");
            return;
        }

        System.out.println("Enter " + n + " elements:");
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");

        int fnegative = -1, snegative = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                fnegative = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] < 0) {
                snegative = i;
                break;
            }
        }

        if (fnegative == -1 || snegative == -1 || fnegative == snegative) {
            System.out.println("Not enough negative elements to calculate the result");
        } else {
            double result = 0;

            System.out.print("Range: ");
            for (int i = fnegative + 1; i < snegative; i++) {
                result += array[i];
                System.out.print(array[i]);
                if (i < snegative - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
