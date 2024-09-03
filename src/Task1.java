import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: float inputs, float result
        System.out.println("Enter first num (float):");
        float fnum1 = sc.nextFloat();
        System.out.println("Enter second num (float):");
        float snum1 = sc.nextFloat();
        float result1 = (float) (Math.pow((((fnum1 + 1) / (snum1 + 2)) + (5 / fnum1 - snum1)), 2) * fnum1 * snum1);
        System.out.println("Result (float): " + result1);

        // Example 2: int inputs, float result
        System.out.println("Enter first num (int):");
        int fnum2 = sc.nextInt();
        System.out.println("Enter second num (int):");
        int snum2 = sc.nextInt();
        float result2 = (float) (Math.pow((((fnum2 + 1.0) / (snum2 + 2.0)) + (5.0 / fnum2 - snum2)), 2) * fnum2 * snum2);
        System.out.println("Result (float): " + result2);

        // Example 3: float inputs, int result
        System.out.println("Enter first num (float):");
        float fnum3 = sc.nextFloat();
        System.out.println("Enter second num (float):");
        float snum3 = sc.nextFloat();
        int result3 = (int) (Math.pow((((fnum3 + 1) / (snum3 + 2)) + (5 / fnum3 - snum3)), 2) * fnum3 * snum3);
        System.out.println("Result (int): " + result3);

        sc.close();
    }
}
