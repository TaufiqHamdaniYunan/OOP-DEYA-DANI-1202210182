public class Calculation implements Runnable {
    double radius, side, area;
    double phi = 3.14;

        public void setSquare(double side) throws IllegalArgumentException {
            if (side < 1) {
                throw new IllegalArgumentException("java can not run the program");
            }
            this.side = side;
            this.area = side * side;

        }

        public double getSquare(){
            return this.area;
        }

        public void setCircle(double radius) throws IllegalArgumentException {
            if (radius < 1) {
                throw new IllegalArgumentException("java can not run the program");
            }
            this.radius = radius;
            this.area = phi * radius * radius;
        }

        public double getCircle(){
            return this.area;
        }

        public void setTrapezoid(double a, double b, double t){
            if (a < 1 || b < 1 || t < 1){
                throw new IllegalArgumentException("java can not run the program");
            }
            this.area = (a + b) * t / 2;
        }

        public double GetTrapezoid(){
            return this.area;
        }

        @Override
        
        public void run() {
            System.out.println("Program will start in: ");
            for (int x = 3; x > 0; x--) {
              System.out.println(x);
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                System.out.println("====Error====");
              }
            }
          }
    
}
