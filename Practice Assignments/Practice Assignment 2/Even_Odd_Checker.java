import java.util.Scanner;
class Even_Odd_Checker{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  char f='y';
  while(f=='y')
  {
  System.out.println("Menu based app - Even/Odd Checker");
  System.out.print("Please enter the number:");
  int num=sc.nextInt();
  if(num%2==0)
  {
   System.out.println("The given number - "+num+" is an EVEN number");
  }
  else 
  {
   System.out.println("The given number - "+num+" is an ODD number");
  }
   System.out.println("Do you want to continue:");
   f=sc.next().charAt(0);
  }
  sc.close();
}
}
   