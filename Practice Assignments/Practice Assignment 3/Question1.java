import java.util.Scanner;
class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];

        System.out.print("arrNum = ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = sc.nextInt();
        }

        int min = arrNum[0];
        int max = arrNum[0];
        int sum = 0;
        int count = arrNum.length;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
            sum += arrNum[i];
        }

        int avg = sum / count;

        System.out.println("The element with the Minimum value: " + min);
        System.out.println("The element with the Maximum value: " + max);
        System.out.println("Average of all array elements: " + avg);
        System.out.println("Total number of array elements: " + count);

        sc.close();
    }
}