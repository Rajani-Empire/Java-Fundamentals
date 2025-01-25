import java.util.*;

public class SearchAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        System.out.println("Emter Elements : ");
        int[] number = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        
        System.out.println("Enter search element : ");
        int x = sc.nextInt();


        for(int i=0;i<size;i++){
            if(number[i]==x){
                System.out.println("Possion of the number : "+(i+1));
                
            }
        }
    }
    
}
