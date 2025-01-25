public class MinMax {
    public static void main(String[] args) {
        int[] num = {3,4,1,5,2};
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
               max=num[i];
            }

        }
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
               min=num[i];
            }

        }
        System.out.println("Maximun value = "+max);
        System.out.println("Minimun value = "+min);
    }
}
