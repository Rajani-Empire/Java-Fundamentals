import java.util.*;

public class ReturnSum {


    public static int calculateSum(int a,int b) {
        int sum=a+b;
        return sum;
        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = "+calculateSum( a,b));

          
        
        
    }
    
}
