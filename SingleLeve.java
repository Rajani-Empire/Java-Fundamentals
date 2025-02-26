import java.util.*;

import bank;


class Shap{
   public void area() {
    System.out.println("display area");
   }
}


class Triangle extends Shap{
     public void area(int l,int h){
        System.out.println(1/2*l*h);
     }

}



class Equal extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
     }
}



public class SingleLeve {
    public static void main(String[] args) {
     //single drived inheritence   -base class ,drived class
     //multi level inheritence   - base class ,drived class,drived class
     //hierarchical minhritence - base class ,drived class/drived class
     //hybride inheritence
     //interfeces


    }
    
}
