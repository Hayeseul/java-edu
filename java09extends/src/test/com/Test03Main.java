package test.com;

public class Test03Main {

   public static void main(String[] args) {
      System.out.println("Car <- Bus");
      
      //방법1.
      Car c = new Car() {
         @Override
         public boolean start() {
            System.out.println("inner start()...");
            return false;
         }
         @Override
         public int run() {
            System.out.println("inner run()...");
            return 0;
         }
      };
      c.start();
      c.run();
      
      //방법2.
      Car c2 = new Bus();
      c2.start();
      c2.run();

   }

}