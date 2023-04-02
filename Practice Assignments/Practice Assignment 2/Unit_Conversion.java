import java.util.Scanner;
class Unit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option = 'y';
        int c=0;
        while (option == 'y') {
            System.out.println("Menu based app - Unit conversion for Distance");
            c++;
            if(c>=1){
            if(c>=2) c=c+3;
            System.out.println(c+". CM to M");
            System.out.println((c+1)+". M to KM");
            System.out.println((c+2)+". KM to M");
            System.out.println((c+3)+". M to CM");
            }
            System.out.print("\nEnter your menu - ");
            int Distance = sc.nextInt();
            switch (Distance) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    int cm1 = sc.nextInt();
                    double m1 = cm1 / 100.0;
                    System.out.printf("%d CM = %.1f M", cm1, m1);
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    int m2 = sc.nextInt();
                    double km1 = m2 / 1000.0;
                    System.out.printf("%d M = %.1f KM", m2, km1);
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    int km2 = sc.nextInt();
                    double m3 = km2 * 1000.0;
                    System.out.printf("%d KM = %.1f M", km2, m3);
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    int m4 = sc.nextInt();
                    double cm2 = m4 * 100.0;
                    System.out.printf("%d M = %.1f CM", m4, cm2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("\nDo you want to Continue: ");
            option = sc.next().charAt(0);
            System.out.println();
        }

        sc.close();
    }
}