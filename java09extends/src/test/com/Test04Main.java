package test.com;

public class Test04Main {

	public static void main(String[] args) {
		System.out.println("interface");
		
		Navi n = new Navi() {

			@Override
			public Car findRendCar() {
				System.out.println("inner class findRendCar()....");
				return new Bus();
			}	
		};
	
		n.findLoad();
		Navi.findStore();
		Car c = n.findRendCar();
		c.start();
		c.run();
		
		System.out.println("==================================================");
		Navi n2 = new Bus ();
		n2.findLoad();
		Car c2 = n2.findRendCar();
		c2.start();
		c2.run();
		
	}//end class

}//end main
