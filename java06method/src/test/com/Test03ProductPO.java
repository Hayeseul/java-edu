package test.com;

import java.util.Date;

public class Test03ProductPO {
	public Tests03ProductVO[] selectAll;
	

	public int insert(Tests03ProductVO vo) {
		System.out.print("insert()......");
		System.out.print(vo.num + " ");
		System.out.print(vo.pname + " ");
		System.out.print(vo.price+ " ");
		System.out.print(vo.mdate+ " ");
		return 1;
	}

	public int update(Tests03ProductVO vo) {
		System.out.println("update()......");
		System.out.print(vo.num + " ");
		System.out.print(vo.pname + " ");
		System.out.print(vo.price+ " ");
		System.out.print(vo.mdate+ " ");
		return 0;
	}

	public int delete(Tests03ProductVO vo) {
		System.out.println("delete()......");
		System.out.print(vo.num + " ");
		System.out.print(vo.pname + " ");
		System.out.print(vo.price+ " ");
		System.out.print(vo.mdate+ " ");
		return 0;
	}

	public Tests03ProductVO select() {
		System.out.println("select()......");
		Tests03ProductVO vo = new Tests03ProductVO();
		vo.num = 1; 
		vo.pname = "notebook001";
		vo.price =15151;
		vo.mdate = new Date();
		return new Tests03ProductVO();
	}	
	public Tests03ProductVO[] selectAll() {
		System.out.println("selectAll ()......");
	      Tests03ProductVO[] vos = new Tests03ProductVO[3];
	      for (int i = 0; i < vos.length; i++) {
	         Tests03ProductVO vo = new Tests03ProductVO();
	         vo.num = 100+i;
	         vo.pname = "Phone"+i;
	         vo.price = 1200000+i;
	         vo.mdate = new Date();
	         vos[i] = vo;
	      }
		return vos;
	}	
	

	
	
	

}
