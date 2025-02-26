class Student{

    String name;
    int age;


    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age) {  // Added this missing method
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+"  "+age);
    }


}




public class Poly{
    public static void main(String args[]){
       //comppile time,funtion overloding overloding
       Student s1 = new Student();
       s1.name = "aman";
       s1.age = 24;
    

        s1.printInfo(s1.name);






    }


}
