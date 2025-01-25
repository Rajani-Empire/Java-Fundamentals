import java.util.*;

public class Gcd {
    
    public static int gcd(int a,int b){
        int rem;

        while(b!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z=gcd(x,y);
        System.out.println("GCD = "+z);

    }
    
}
