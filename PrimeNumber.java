
import java.util.*;

public class PrimeNumber {

    public static void prime(int a){
        int count=0;
        for(int i=2;i*i<a;i++){
            if(a%i==0){
                count++;
                break;
            }
        }

        if(count==0){
            System.out.println("This is a Prime number");
        
        }
        else{
            System.out.println("This is not a Prime number");
        }

        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc. nextInt();
        prime(x);
        
    }
    
}
