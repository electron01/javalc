package by.overone.alexsey.lecture20;

public class Moderator {
     private String name;
     private int age;
     private String info;

     public Moderator (String name,String age) throws ModeratorAgeNotNumber {
          try{
               this.age = Integer.parseInt(age);
          }catch (NumberFormatException exception){
               throw new ModeratorAgeNotNumber("Moderator age not a number!");
          }

          this.name=name;
          this.info = "{Moderator name:" +name + ", age:" + age + "}";
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

     public String getInfo() {
          return info;
     }

     public void setInfo(String info) {
          this.info = info;
     }

}




