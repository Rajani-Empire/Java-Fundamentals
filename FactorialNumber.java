import java.util.*;

public class FactorialNumber {

    public static int factorial(int a){
        int fact=1;
        if(a<0)
        {
            System.out.println("Invalid number");
            return -1;
        }
        if(a==0 || a==1){
        
            System.out.println("Factorial number = "+fact);
            return -1;
        }
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("Factorial number = "+fact);
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        factorial(x);
    }
    
}
