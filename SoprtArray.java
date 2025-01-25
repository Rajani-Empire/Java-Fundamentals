import java.util.Scanner;

public class SoprtArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        System.out.println("Emter Elements : ");
        int[] number = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int temp;
        for(int i=0;i<number.length-1;i++){
          for(int j=0;j<size-i-1;j++){
            if(number[j]>number[j+1]){
                temp =number[j];
                number[j]=number[j+1];
                number[j+1]=temp;

            }
          }
        }

        System.out.println("Sorted array : ");
        for(int i=0;i<number.length;i++){
         System.out.print(number[i]+" ");
        }
        
        
    }
    
}
