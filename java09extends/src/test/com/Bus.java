package test.com;

public class Bus extends Car implements Navi, Aircon {

	// implements 뒤에는 class가 올 수 없고 interface만 가능. 
	// ineterface는 다중상속을 지원하기위해 만들어짐. 
   public int pay() {
      System.out.println("Bus  pay()..");
      return 1000;
   }
   
   @Override
   public boolean start() {
      System.out.println("Bus  start()..");
      return false;
   }

   @Override
   public int run() {
      System.out.println("Bus  run()..");
      return 0;
   }

@Override
public Car findRendCar() {
	System.out.println("Bus findRednCar()...");
	
	return new Bus();
}
   

   
   

}