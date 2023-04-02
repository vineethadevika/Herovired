import java.util.Scanner;
class Student_Marks {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Marks Obtained by a Student:");
    double marks_obtained=sc.nextDouble();
    System.out.print("Total Marks:");
    double total_marks=sc.nextDouble();
double percentage= (marks_obtained/total_marks)*100;
System.out.printf("Percentage:%.2f%%\n",percentage);            
double GPA=0.0;
 if(percentage>0 && percentage<=59)
{
    System.out.print("Grade F");
    GPA=0.0;
}
else if(percentage>60 && percentage<=69)
{
    System.out.print("Grade D");
    GPA=1.0;
}
else if(percentage>70 && percentage<=79)
{
   System.out.print("Grade C");
   GPA=2.0;
}
else if(percentage>80 && percentage<=89)
{
   System.out.print("Grade B");
   GPA=3.0;
}
else if(percentage>90 && percentage<=100)
{
   System.out.print("Grade A");
   GPA=4.0;
}

System.out.print(","+"GPA = "+GPA);
sc.close();
     }

}
