package test.com;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Test04Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***********Map***********");
		
		//키와 값으로 구성 
		// 니킄 중복허용안함 ( 유니크 ) , 값은 중복허용 
		//제네릭<키타입객체, 값타입객체>
		
		
	//	Hashtable<String, String> map = new Hashtable<String, String>();
		Map<String, String> map = new Hashtable<String, String>();

		map.put( "age" , "33");
		map.put( "age" , "44");
		map.put( "name" , "Kim");
		map.put( "name" , "yangssem");
		map.put( "email" , "aaa@aaa.com");
		// 출력값이 44만 나오는 이유: 1. age =33, 2. age=44가 없으면 수정해 
		
		System.out.println("map.size() :" + map.size());
		System.out.println("age :" + map.get("age"));
		System.out.println("name :" + map.get("name"));
		System.out.println("email :" + map.get("email"));
		
		System.out.println(map.keySet());
		for ( String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		System.out.println("=================================");
		Map<String, Test02BoardVO> map2 = new Hashtable <String , Test02BoardVO>();
		
		map2.put("vol", new Test02BoardVO());
		map2.put("vo2", new Test02BoardVO());
		map2.put("vo3", new Test02BoardVO());
		System.out.println(map2.keySet());
		for (String key : map2.keySet()) {
			System.out.println(map2.get(key));
		}
				System.out.println("=================================");
				
				Map<String, List<Test02BoardVO>> map3 = new Hashtable <String , List<Test02BoardVO>>();
				
				List<Test02BoardVO> list = new ArrayList<Test02BoardVO>();
				list.add(new Test02BoardVO());
				list.add(new Test02BoardVO());
				list.add(new Test02BoardVO());
				
				map3.put("list" , list);
				
				for ( Test02BoardVO vo : map3.get("list")) {
					System.out.println(vo);
					
				}
				
				
		
		
		
	}

}
