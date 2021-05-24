package test.com;


public class Test03Student {
	
	int num1; 
	String name1;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	long grade;

	 public Test03Student() {
	      System.out.println("Test03Student()");
	  	num1= 1;
		name1= "김철수";
		kor=88;
		eng= 93;
		math=99;
		total=kor+eng+math;
		avg=total/3;
		grade = (int)avg/10;
		
		if ( grade ==9) {
			System.out.println(" A ");
		}
		else if (grade ==8) {
			System.out.println(" B ");
		}
		else if ( grade ==7) {
			System.out.println(" C ");
		}
		else if (grade ==6) {
			System.out.println(" D ");
		}
		else {
			System.out.println(" F ");
		}
	 }
	 
	 /*교수님 ver.
	  * switch ((int) avg / 10) {
      case 10:
      case 9:
         grade = "A";
         break;
      case 8:
         grade = "B";
         break;
      case 7:
         grade = "C";
         break;
      default:
         grade = "D";
         break;
      }
	  
	  */
	 
	
		  public Test03Student (int num1, String name1,int kor, int eng,int math,int total,double avg, char grade) {
				System.out.println("Test03Student()int num1, String name1,int kor, int eng,int math,int total,int avg,char grade");
				this.num1 = num1;
				this.name1 =name1;
				this.kor = kor;
				this.eng= eng;
				this.math = math;
				this.total = total;
				this.avg = avg;
				this.grade = grade;
	

	}
}
