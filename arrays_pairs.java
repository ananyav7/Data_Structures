import java.util.*;
class arrays_pairs{
    public static void main(String args[]){
         int num[]={1,2,6,4,5};
         for(int i=0;i<num.length;i++){
             for (int j=1;j<num.length;j++)
                 {
                     System.out.print("("+num[i]+","+num[j]+")");
             }
             System.out.println();
         }
    }
}