import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square matrix size (<=20): ");
        int n = sc.nextInt();
        if (n > 20) {
            System.out.println("Array size is too big");
            return;
        }

        System.out.println("Enter array elements:");
        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            boolean isSymmetric = true;
            int left = 0;
            int right = n - 1;

            while (left < right) {
                if (array[i][left] != array[i][right]) {
                    isSymmetric = false;
                    break;
                }
                left++;
                right--;
            }

            if (isSymmetric) {
                System.out.println("Symmetry found in: " + (i + 1));
            }

            sc.close();
        }
    }
}
