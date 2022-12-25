import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerId, orderQty;
        try {
            System.out.print("Enter Customer ID : ");
            customerId = input.nextInt();
            
            System.out.print("Enter how much food to made : ");
            orderQty = input.nextInt();

            Thread mak1 = new Thread(machine);
            Waiters waiters = new Waiters(orderQty, customerId);
            Thread jlh= new Thread(waiters);

            mak1.start();
            jlh.start();
            mak1.join();
            jlh.join();

            input.close();
        } 
        catch (Exception kecuali) {
            System.out.println("input must be integer");
        }
    }
}
