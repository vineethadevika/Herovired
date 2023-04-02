import java.util.Scanner;
class Mutiplication_Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("num = ");
int num=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.print(num +" X " +i+" = "+(num*i)+" \n");
}
sc.close();
}
}