import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {

            System.out.println("press 1 to convert C to F");
            System.out.println("press 2 to convert F to C");
            System.out.println("press 0 to exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print(" enter C ");
                    C = input.nextDouble();
                    System.out.println(" F is: " + C_to_F(C));
                    break;
                case 2:
                    System.out.print(" enter F ");
                    F = input.nextDouble();
                    System.out.println(" C is: " + F_to_C(F));
                    break;
                case 0:
                    System.exit(0);

            }
        }
        while (choice != 0);
    }

    public static double C_to_F(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double F_to_C(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
