import java.util.Scanner;
class Three_Integers
{
public static int Smallest(int num1, int num2, int num3) 
{
 int min = num1;
 if (num2 < min) min = num2;  
 if (num3 < min)  min = num3; 
 return min; 
} 

public static int Largest(int num1, int num2, int num3)
 {
 int max = num1; 
 if (num2 > max) max = num2;   
 if (num3 > max) max = num3;    
 return max; 
 }


public static int Average(int num1,int num2,int num3)
{
 return (num1+num2+num3)/3;
}

public static void main(String args[])
{

 Scanner sc=new Scanner(System.in);
 System.out.print("num1 = ");
 int num1 = sc.nextInt();
 System.out.print("num2 = ");
 int num2 = sc.nextInt();
 System.out.print("num3 = ");
 int num3 = sc.nextInt();
 System.out.println("The Smallest Number: "+ Smallest(num1,num2,num3));
 System.out.println("The Largest Number: "+Largest(num1,num2,num3));
 System.out.println("Average of all three numbers:"+Average(num1,num2,num3));
}
}


