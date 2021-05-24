package test.com;

public class ThreadEx extends Thread {
	 	@Override
	 	public void run() {
	 		// TODO Auto-generated method stub
	 		for (int i =0 ; i <10; i ++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	 	}

}
