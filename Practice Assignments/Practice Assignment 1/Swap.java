import java.util.Scanner;  
class Swap   
{  
    public static void main(String a[])   
    {   
        Scanner sc = new Scanner(System.in); 
        System.out.print("numA = "); 
        int numA = sc.nextInt();  
        System.out.print("numB = "); 
        int numB = sc.nextInt();
        System.out.println(); 
        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;  
        System.out.println("numA = "+numA+"\nnumB = "+numB); 
        sc.close();  
    }   
}  