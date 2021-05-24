package test.com;


public class TestDAOimpl implements TestDAO {
	
	   public TestDAOimpl() {
		      System.out.println("TestDAOimpl()...");
	   }
	   
	@Override
	public int insert(TestVO vo) {
		
		  System.out.println("insert()....");
	      System.out.println(vo);
	
	      return 0;
	      
	
}
}

