package test.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test03Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*********Set*********");
		//Set: 순서가 없고 중복데이터를 허용하지 않는 설정값 
		//데이터 변경의 개념이 없고 지우고 다시 추가개념 
		Set<String> s = new HashSet<String>();
		System.out.println("s.size() : "  + s.size());
		s.add("Kim");
		s.add("Kim");   
		s.add("Kim1");
		s.add("Kim2");
		System.out.println("s.size() : "  + s.size());

		s.remove("kim2");
		System.out.println("s.size() : "  + s.size());
		
		s.clear();
		System.out.println("s.size() : "  + s.size());
		
		System.out.println("===================================");
		
		//랜덤한 1~45사이의 정수를 6개 뽑고싶다. 
		// 뽑힌 정수는 유니크하게 배열에 넣어보자 
		// 예 : 1, 3, 33, 44, 7, 8 :사이즈 6 
		// 예 : 1, 3, 33, 33, 7, 7 :사이즈 4
		
		Random li = new Random();
		//System.out.println(li.nextInt(45)+1); // 0~44까지의 1가지 수를 뽑는다 
		
		
		
		Set<Integer> li_lotto = new HashSet<Integer>();// 중복을 허용하지 않는다는 것을 선언 
		li_lotto.add(li.nextInt(45)+1);
		while (li_lotto.size() <6 ) {
			li_lotto.add(li.nextInt(45)+1);
			int li_su = li.nextInt(45)+1;
			System.out.println("li_su : " + li_su);
			li_lotto.add(li_su);
		}
		
		System.out.println("li_lotto.size() : "  +li_lotto.size());
		
		for ( Integer x : li_lotto ) {
			System.out.print(x + " ");
		}
		System.out.println();
	
		// 작은수부터 큰수로 정렬하기 
		Object[] sus = li_lotto.toArray();
		
		//int[] sus = new int [] {1,3,33,44,7,8}
		Arrays.sort(sus) ; // 정렬 해주는 메소드 
		
		for (Object x :sus ) {
			System.out.print(x + " ");
		}
		System.out.println();
		

		/*
		Random li = new Random();
		li = [1,3,33,44,7,8]
		sampleList = Random.sample(li, 5);
		int a[] = new int[] { 1,3,33,44,7,8};
		List<Integer> list = new ArrayList<>();
		
		
		for ( int i = 0 ; i <5 ; i++)
		{
			System.out.println("뽑힌 정수는 : " + a[i]);
			a[i] = r.nextInt(1,3,33,44,7,8) ;
			for ( int j = 0 ;  j<i; j++ ) {
				if ( a[i] == a[j]) {
					i --;
				}
			}
		}
		
		
		for ( int value : a) {
			list.add(value);
			
		}
		*/
		
		System.out.println("=====================================");
		
		Set<Test02BoardVO> s2 = new HashSet<Test02BoardVO>();
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		s2.add(new Test02BoardVO());
		System.out.println(s2.size());
		
	}

}
