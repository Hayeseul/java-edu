package test.com;

public class Student extends Person{

   private int hakyun;
   private int ban;
   private int no;
//   private int age = 44;
//   private String name = "kim";

   public void study() {
      System.out.println("study()....");
      this.eat();
      sleep();
   }
   
//   public void sleep() {
//      System.out.println("sleep().....");
//   }
   
   // 오버라이딩 : 메소드의 재정의, 어노테이션 선언가능(@Override)
   @Override
   public void eat() {
      System.out.println("eat().....: 라면");
   }

   @Override
   public String toString() {
      return "Student [hakyun=" + hakyun + ", ban=" + ban + ", no=" + no + ", age=" + super.age + ", name=" + super.name + "]";
   }   
   
}// end class
