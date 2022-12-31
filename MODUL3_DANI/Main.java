import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation a = new Calculation();
        Thread b = new Thread(a);
        Scanner c = new Scanner(System.in);
        boolean repeat = true;
        do {

            try{
                System.out.println("\n==MenuProgram==");
                System.out.println("1.Square");
                System.out.println("2.Circle");
                System.out.println("3.Trapezoid");
                System.out.println("0.exit");
                System.out.println("\nSelectMenu: ");
                int Menu = c.nextInt();

                switch(Menu){
                    case 1:
                    System.out.println("\nEnter the length of the side of the square : ");
                    double side = c.nextDouble();
                    System.out.println("\n===Program Will Start In===");
                    a.setSquare(side);
                    b.start();
                    b.join();
                    System.out.println("\nThe calculation result: " + a.getSquare());
                    break;

                    case 2:
                    System.out.println("\nEnter the radius of circle : ");
                    double radius = a.nextDouble();
                    System.out.println("\n===Program Will Start In===");
                    a.setCircle(radius);
                    b.start();
                    b.join();
                    System.out.println("\nThe calculation result: " + a.getSquare());
                    break;

                    case 3:
                    System.out.println("\nEnter the side of the base of the trapezoid : ");
                    double d = a.nextDouble();
                    System.out.println("\nEnter the upper of the trapezoid : ");
                    double e = a.nextDouble();
                    System.out.println("\nEnter the height of the trapezoid : ");
                    double f = a.nextDouble();
                    System.out.println("\n===Program Will Start In===");
                    a.setTrapezoid(d, e, f);
                    b.start();
                    b.join();
                    System.out.println("\nThe calculation result: " + a.getSquare());
                    break;

                    case 0:
                    System.out.println("\nProgram End");
                    repeat = false;
                    break;

                    default:
                    System.out.println("\nOption not available");
                    continue;
                }
                repeat = false;
            }
            catch(InputMismatchException e){
                System.out.println("error, input must be a number");
                break;

            }
        } while (repeat);
        input.close();
    }
}
