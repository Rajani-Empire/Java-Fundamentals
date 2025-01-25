import java.util.*;

public class Fibonakki {

    public static void printFibonakki(int x){
        int m = 0;
        int n =1 ;
        int sum=0; 

        for(int i=1;i<=x;i++){
            sum = m+n;
            System.out.print(m+" ");
            m= n;
            n= sum;
        }
        

        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFibonakki(a);
        
    }
    
}
