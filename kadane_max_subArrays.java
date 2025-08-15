import java.util.*;
class kadane_max_subArrays{
    public static void printSubarrays(int numbers[]){
         int ms = Integer.MIN_VALUE;
         int cs=0;
         for(int i=0; i<numbers.length;i++){
             cs=cs+numbers[i];
             if(cs<0){
                 cs=0;
             }
             ms=Math.max(cs,ms);
         }
         System.out.println("max subarray sum is: "+ms);
    }
    public static void main(){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}