package test.com;

public /*final*/ class Person /*extends Object*/{
   
   protected int age = 33;
   protected String name = "yangssem";
   
   public void sleep() {
      System.out.println("sleep().....");
   }
   
   // final : 상속 받은 클래스에서 재정의 못하도록 막기
   public /*final*/ void eat() {
      System.out.println("eat().....");
   }

   @Override
   public String toString() {
      return "Person [age=" + age + ", name=" + name + "]";
   }
   
}// end class