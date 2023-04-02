import java.util.Scanner;
class SubstringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("stringName:");
        String s = sc.nextLine();
        System.out.print("Starting index:");
        int startIndex = sc.nextInt();
        System.out.print("Ending index:");
        int endIndex = sc.nextInt();
        String subString = s.substring(startIndex, endIndex+1);
        System.out.println("subString of "+s+" from "+startIndex+" to "+endIndex+" is: " + subString);
    }
}
