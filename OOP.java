// class Pen{
//     //properties
//     String colour;
//     String type;  // ballpen ; gel

//     //method
//     public void write(){
//         System.out.println("Writing something");
//     }
//     public void printColour(){
//         System.out.println(this.colour+"\n");
        
//     }
// }


class Student{
    String name;
    int age;
    

    public void print(){
        System.out.println(this.name+"\n"+this.age+"\n");
    }
    

    //Non peramiterize constructor
    // Student(){
    //     System.out.println("Constructor called");
    // }


    //peramiterize constructor
    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;

    // }



    //Copy constructor
    Student(Student s2){
        this.name =s2.name;
        this.age = s2.age;

    }

    Student(){
        
    }






}

public class OOP {
    public static void main(String[] args) {
       //object
        // Pen pen1 = new Pen();
        // pen1.colour = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.colour = "red";
        // pen2.type = "ballpen";

        // pen1.write();
        // pen1.printColour();
        // pen2.printColour();


        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;


        Student s2 = new Student(s1);
       


        // student1.name = "Rajani Akthetr";
        // student1.roll = 45;
        // student1.dept = "Software Engineering";


        // Student student2 = new Student();
        // student2.name = "Jahid Hassan";
        // student2.roll = 01;
        // student2.dept = "Information and communication technology";


        s2.print();
        // student2.print();


    }
}
