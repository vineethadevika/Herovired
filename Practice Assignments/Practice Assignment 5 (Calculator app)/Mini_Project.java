import java.util.*;
class Mini_Project{
    public static int fact(int n)
    {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Console-based Calculator app");

        
        System.out.println();
        int x=1;
        while(x!=0)
        {
            System.out.println("Select the operators");
            System.out.println("+ -> Addition\n- ->Subraction");
            System.out.println("* -> Multiplication\n/ -> Division");
            System.out.println("% -> Percentage\nF -> Factorial");
            System.out.println("s -> Square\nC -> Cube");
            System.out.println("S -> Square Root\nP ->a Power b");
            System.out.println("r -> a Root b\nx -> Exit");
            System.out.println("Select any operand");
            char s = sc.next().charAt(0);
            int a,b;
            try{
            switch(s)
            {
                case '+':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a+b);
                    break;
                }
                case '-':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a-b);
                    break;
                }
                case '*':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a*b);
                    break;
                }
                case '/':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a/b);
                    break;
                }
                case '%':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(a%b);
                    break;
                }
                case 'F':
                {
                    System.out.println("Enter the fact value");
                    a=sc.nextInt();
                    System.out.println(fact(a));
                    break;
                }
                case 's':
                {
                    System.out.println("Enter the value");
                    a=sc.nextInt();
                    System.out.println(a*a);
                    break;
                }
                case 'C':
                {
                    System.out.println("Enter the value");
                    a=sc.nextInt();
                    System.out.println(a*a*a);
                    break;
                }
                case 'S':
                {
                    System.out.println("Enter the values of a");
                    a=sc.nextInt();
                    System.out.println(Math.sqrt(a));
                    break;
                }
                case 'p':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(Math.pow(a,b));
                    break;
                }
                case 'r':
                {
                    System.out.println("Enter the values of a and b");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    double root=Math.round(Math.pow(b,1.0/a));
                    System.out.println(root);
                    break;
                }
                case 'x':
                {
                    x=0;
                    break;
                }

            }
            }
            catch(ArithmeticException e) {
                System.out.println("An Arithmetic Exception Occurred: " + e.getMessage());
            }
            catch(InputMismatchException e) {
            System.out.println("InputMismatchException Occurred: " + e.getMessage());
            }
        }
    }
}