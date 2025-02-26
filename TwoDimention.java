import java.util.*;

public class TwoDimention {
  public static void main(String[] args) {
    // int[][] num = new int[2][2];
    // num[0][0]=1;
    // num[0][1]=2;
    // num[1][0]=3;
    // num[1][1]=4;
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();


    int[][] num = new int[row][col];

    for(int i=0; i<row; i++){ 
      for(int j=0; j<col; j++){  
        num[i][j] = sc.nextInt();
      }
    }

    for(int i=0; i<row; i++){  
      for(int j=0; j<col; j++){  
        System.out.println("Num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
    

  }
    
}
