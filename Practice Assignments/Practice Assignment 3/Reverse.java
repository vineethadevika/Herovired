import java.util.Scanner;
class Reverse
 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number of elements in the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];

        System.out.print("arrNum = ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }

        System.out.print("The elements in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }
        sc.close();
    }
}
