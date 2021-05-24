package test.com;

public class Test04ScoreDAO {

	private int kor;
	private int eng;
	private int total;

	public Test04ScoreVO[] selectAll() {
		System.out.println("selectAll ()...");
		Test04ScoreVO[] vos = new Test04ScoreVO[4];
		for ( int i = 0; i <vos.length; i++) {
			Test04ScoreVO vo = new Test04ScoreVO();
			vo.num=1;
			vo.kor = 85;
			vo.eng = 90;
			vo.total = kor +eng;
			vo.avg = total/3.0;
			vos[i] = vo;
		}
		return vos;
		
	}

	public int insert(Test04ScoreVO vo) {
		System.out.println(" insert() :" + vo.insert);
		return 0;
	}

	public int update(Test04ScoreVO vo) {
		System.out.println(" update() :" + vo.update);

		return 1;
	}

	public int delete(Test04ScoreVO vo) {
		System.out.println(" update() :" + vo.delete);

		return 2;
	}

	public Test04ScoreVO select() {
		System.out.println(" selsect()...");
		Test04ScoreVO vo = new Test04ScoreVO();
		vo.num = 1;
		vo.kor = 85;
		vo.eng = 90;
		vo.total =kor + eng;
		vo.avg = total/3.0;
		
		return new Test04ScoreVO();

		
		
	}

	public Test04ScoreVO searchingList(String string, String string2) {
		System.out.println();
		return null;
	}

	
	

}
