import java.util.Scanner;
import java.util.Arrays;
class Sort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        System.out.print("arrNum = ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        Arrays.sort(arrNum);
        System.out.print("The elements in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.print("\nThe elements in descending order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }
        sc.close();
    }
}
