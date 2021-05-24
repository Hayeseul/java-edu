package test.com;

public class Test01Main {

	public static void main(String[] args) {
		   System.out.println("클래스 간의 상속...");
		      
		      Person p = new Person();
		      System.out.println(p);
		      p.sleep();
		      p.eat();
		      
		      System.out.println();
		      
		      
		      Student st = new Student();
		      System.out.println(st);// student에서 eat과 sleep도 함께 부르고 있다. 
		      st.study();
		      
		      System.out.println();
		      
		      
		      // 상속 관계에서 슈퍼클래스의 모든 자원을 서브클래스가 보유하고있다. 
		      //따라서 슈퍼클래스의 타입의 객체생성시에 서브클래스의 생성자로 객체생성이 가능하다. 
		      //생성된 객체는 슈퍼클래스의 자원으로만 사용가능하다. 
		      //이를 상속이 전제로된 다형성 (묵시적 캐스팅) 객체 생성 
		      System.out.println("=============다형성==================");
		      
		      Person p2 = new Student();
		      p2.sleep();
		      p2.eat();
		      p2 = new Teacher();
		      p2.sleep();
		      p2.eat();
		      System.out.println("====================================");
		      
		      // 객체 생성시에 묵시적 상속관계(기호{})를 정의할 수 있다. ( 익명,무명, 내부클래스)
		      Person p3 = new Person();  /* class???extneds Person*/ {
		    	  // class 영역 
		    	/*  int x ; 
		    	  public void timeOut() {
		    		  System.out.println("timtOut()...");
		    	  }
		      };

		      @override
		      public void sleep() {
		    	  System.out.println("inner class sleep()...");
		    	  
		      }
		      */
		      }
		      
/*
		      class Aaa extends Person{
		    	  
		      }
		      Person p4 = new Aaa();
		      원래 이런식으로 만들어야 됨. 
		      */
		      }//end main
		      
		      
		   }//end class

		



