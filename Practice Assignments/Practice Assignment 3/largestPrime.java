import java.util.Scanner;
class largestPrime {

     public static boolean isPrime(int num) {
        if (num <= 1)   return false;
        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0)  return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];
        System.out.print("arrNum = ");
        for (int i = 0; i < n ; i++) {
            arrNum[i] = sc.nextInt();
        }

        int largestPrime = Integer.MIN_VALUE;
        for (int num : arrNum) {
            if (isPrime(num) && num > largestPrime) {
                largestPrime = num;
            }
        }

        if (largestPrime == Integer.MIN_VALUE) 
        {
            System.out.println("There are no prime numbers in the array");
        }
        else
        {
            System.out.println("The Largest Prime number in given array: " + largestPrime);
        }
        sc.close();
    
    }
}