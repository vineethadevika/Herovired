import java.util.Scanner;
class Prime
{
public static boolean isPrime(int n)
{
 if(n<=1) return false;
 for(int i=2;i*i<=n;i++)
 {
   if(n%i==0) return false;
 }
 return true;
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("num = ");
 int num=sc.nextInt();
 if(isPrime(num))
 {
   System.out.println("The given number "+num+" is a Prime number");
 }
 else
 {
   System.out.println("The given number "+num+" is NOT a Prime number");
 }
}
}