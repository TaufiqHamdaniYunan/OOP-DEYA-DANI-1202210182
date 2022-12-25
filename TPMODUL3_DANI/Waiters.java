public class Waiters implements Runnable{
    
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int orderQty, int customerId){
        this.orderQty = orderQty;
        this.customerID = customerId;
    }
    
    public void run(){
        while(true){
            getFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException kecuali) {
                kecuali.printStackTrace();
            }
        }
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Food is ready to deliver");
            Restaurant rst = new Restaurant();
            rst.setWaitingForPickup(false);

            if(Restaurant.getFoodNumber() == this.orderQty + 1){
                OrderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter : Tell the Restaurant to make another food\n");
        }
    }

    public void OrderInfo(){
System.out.println("RECEIPT");
        System.out.println("Customer ID        : "+this.customerID);
        System.out.println("Number of food     : "+this.orderQty);
        System.out.println("Total Price        : "+this.orderQty*foodPrice);
    }
}
