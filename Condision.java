import java.util.*;


public class Condision {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not adult");
        // }


        // if(age%2==0){
        //     System.out.println("Number is even");
        // }else{
        //     System.out.println("Number is odd");
        // }


        if(a>b){
            System.out.println("a is greater");
        }else if(a==b){
            System.out.println("Equal");
        }else{
            System.out.println("a is smaller");
        }

    }
    
}
