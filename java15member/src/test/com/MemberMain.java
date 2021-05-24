package test.com;

import java.util.List;

public class MemberMain {

   public static void main(String[] args) {
      System.out.println("회원가입 프로그램");
      
      //1.MemberVO-num,id,pw,name,tel: 은닉,게터세터,toString(),hashcode&equals메소드 오버라이딩
      //2.MemberDAO-interface:insert,update,delete,selectOne,selectAll,searchList 추상메소드들
      //3.MemberDAOimpl-MemberDAO를 상속받은 클래스
         //3-1.생성자:드라이버 연결(jdbc라이브러리 추가할것lib폴더만들어서 
                  //넣고Add to build path)
      MemberDAO dao = new MemberDAOimpl();
      
         //3-2.각 오버라이딩된 메소드에서 디비커넥팅 및 예외처리
            //3-2-1:insert
      MemberVO vo = new MemberVO();
      vo.setId("tiger");
      vo.setPw("pw12434");
      vo.setName("kim");
      vo.setTel("010");
      int result = dao.insert(vo);
      System.out.println("insert result:"+result);
      
           
      
      //3-2-2:update
      vo = new MemberVO();
      vo.setNum(10);
      vo.setId("adminUp");
      vo.setPw("hi1234Up");
      vo.setName("yangUp");
      vo.setTel("02Up");
      result = dao.update(vo);
      System.out.println("update result:"+result);
      
      
      //3-2-3:delete
      vo = new MemberVO();
      vo.setNum(11);
      result = dao.delete(vo);
      System.out.println("delete result:"+result);
      
      //3-2-4:selectOne
      vo = new MemberVO();
      vo.setNum(10);
      MemberVO vo2 = dao.selectOne(vo);
      System.out.println("selectOne vo2:"+vo2);
      
      //3-2-5:selectAll
      List<MemberVO> list = dao.selectAll();
      for (MemberVO x : list) {
         System.out.print(x.getNum()+" ");
         System.out.print(x.getId()+" ");
         System.out.print(x.getPw()+" ");
         System.out.print(x.getName()+" ");
         System.out.println(x.getTel());
      }
      
      
      //3-2-6:searchList
      list = dao.searchList("name", "k");
      for (MemberVO x : list) {
         System.out.print(x.getNum()+" ");
         System.out.print(x.getId()+" ");
         System.out.print(x.getPw()+" ");
         System.out.print(x.getName()+" ");
         System.out.println(x.getTel());
      }
      
      
         //3-3.각 오버라이딩된 메소드에서 쿼리를 실행 로직작성 및 반환처리
            //쿼리실행을 위해서 테이블 및 시퀀스를 미리생성해둘것.
            //예: 테이블명:member,컬럼명:VO속성을 참고해서 생성,시퀀스명:seq_테이블명
            //3-3-1:insert
            //3-3-2:update
            //,,,,
         
      
      //4.메인메소드에서 각 입력,수정,삭제,단일검색,모두검색,조건검색 테스팅 및 출력
      
      
      
   }//end main

}//end class