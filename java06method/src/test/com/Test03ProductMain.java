package test.com;

import java.util.Date;

public class Test03ProductMain {

	private static String insert;
	private static String update;
	private static String delete;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***Test03ProductMain***");
		
		System.out.println("=======================예제 1=========================");
		//VO : Tests03ProductVO.java
		// 제품번호num, 제품명pname, 제품가격price, 제조일자mdate. 
		
		Tests03ProductVO vo = new Tests03ProductVO();
		//vo = new Tests03ProductVO(100,"pc001",15151, new Date() );
		

		
		System.out.println("=======================예제 2=========================");
		
		//PO : Test03ProductPO.java
		// 입력insert, 수정update, 삭제delete : int 
		Test03ProductPO p = new Test03ProductPO();
		int result = p.insert(vo);
		System.out.println(result);
		
		result = p.update(vo);
		System.out.println(result);
		
		result = p.delete(vo);
		System.out.println(result);
		
		// 단일검색select : Tests03ProductVO
		Tests03ProductVO vo2 = p.select();
		System.out.println(vo2.num);
		System.out.println(vo2.pname);
		System.out.println(vo2.price);
		System.out.println(vo2.mdate);
		
		// 모든제품검색selectAll : Tests03ProductVO[]
		Tests03ProductVO[] vos = p.selectAll;
		for( int i =0; i<vos.length; i++) {
			System.out.println( vos[i].num + " ");
			System.out.println( vos[i].pname + " ");
			System.out.println( vos[i].price + " ");
			System.out.println( vos[i].mdate );

			System.out.println("=======================예제 3=========================");
			// 입력insert, 수정update, 삭제delete : int  (Tests03ProductVO)
			
			result = p.insert(vo);
			System.out.println(result);
			
			result = p.update(vo);
			System.out.println(result);
			
			result = p.delete(vo);
			System.out.println(result);

			
		}
		
		
		
		
		
	
		

	}

}
