package test.com;

public class Test04ScoreMain {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***Test04ScoreMain");
		
		Test04ScoreVO vo = new Test04ScoreVO();
		Test04ScoreDAO b = new Test04ScoreDAO();
		
		int result =b.insert(vo);
			System.out.println(result);
				
		result = b.update(vo);
		System.out.println(result);
		
		result = b.delete(vo);
		System.out.println(result);
		
		Test04ScoreVO vo1 =b.select();
		System.out.println(vo.num);
		System.out.println(vo.kor);
		System.out.println(vo.eng);
		System.out.println(vo.total);
		System.out.println(vo.avg);
		
		Test04ScoreVO[]  vos = b.selectAll();
		for (int i =0; i<vos.length; i++) {
			System.out.println(vos[i].num + " '");
			System.out.println(vos[i].kor + " '");
			System.out.println(vos[i].eng + " '");
			System.out.println(vos[i].total + " '");
			System.out.println(vos[i].avg + " '");
		}
		
		Test04ScoreVO vo2 = b.searchingList(String, String);
		
		
		
		
		

	}

}
