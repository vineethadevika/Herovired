import java.util.Scanner;
import java.util.HashMap;
class Frequencies 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the super set array: ");
        int size1 = sc.nextInt();
        int[] arrSuperSet = new int[size1];
        System.out.print("arrSuperSet = ");
        for (int i = 0; i < size1; i++) {
            arrSuperSet[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the subset array: ");
        int size2 = sc.nextInt();
        int[] arrSubSet = new int[size2];
        System.out.print("arrSubSet = ");
        for (int i = 0; i < size2; i++) {
            arrSubSet[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arrSuperSet) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements in subset array present in super set array:");
        for (int num : arrSubSet) {
            int freq = freqMap.getOrDefault(num, 0);
            System.out.println("Frequency of " + num + ": " + freq);
        }
        sc.close();

    }
}