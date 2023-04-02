import java.util.Scanner;
class Move_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        System.out.print("arrNum = ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }
        int countOne = 0;
        for (int i = 0; i < n; i++) {
            if (arrNum[i] != 1) {
                arrNum[countOne++] = arrNum[i];
            }
        }

        while (countOne < n) {
            arrNum[countOne++] = 1;
        }

        System.out.print("Array elements after moving Ones to end: ");
        for (int num : arrNum) {
            System.out.print(num + " ");
        }

        sc.close();

    }
}