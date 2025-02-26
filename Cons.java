import java.util.*;

class Student{

    String name;
    int age;


     //same as class name,no return type,

    Student(Student s2){
        this.name = s2.name;
        this.age =s2.age;

        System.out.println(name+"   "+age);

    }

    Student(){
        
    }



}








public class Cons {

    public static void main(String[] args) {
        

    Student s1 = new Student();
    s1.name = "aman";
    s1.age = 22;
   

    Student s2 = new Student(s1);
   

    
   
    }
    
}
