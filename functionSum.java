import java.util.*;
class functionSum{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Sum(a,b);
        System.out.println(sum);
    }
    public static int Sum(int a, int b){
        int sum=a+b;
        return sum;
    }
}