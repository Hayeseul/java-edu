package test.com;

public class Test01VO {
   
   private int num;
   private String name;
   private int age;
   
   public int getNum() {
      return num;
   }
   public void setNum(int num) {
      this.num = num;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   @Override
   public String toString() {
      return "Test01VO [num=" + num + ", name=" + name + ", age=" + age + "]";
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + num;
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Test01VO other = (Test01VO) obj;
      if (age != other.age)
         return false;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      if (num != other.num)
         return false;
      return true;
   }
   
   
}// end class