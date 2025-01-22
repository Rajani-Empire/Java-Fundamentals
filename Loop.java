
import java.util.*;

public class Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // int sum =0;
        // for(int i=1;i<=x;i++){
        //     sum+=i;
        // }

        // System.out.print("Sum = "+sum);

        int mult;
        for(int i=1;i<11;i++){
            mult=x*i;
            System.out.println(x+" x "+i+" = "+mult);
        }

    }
    
}
