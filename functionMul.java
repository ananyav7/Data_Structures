import java.util.*;
class functionMul{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Mul=Mul(a,b);
        System.out.println(Mul);
    }
    public static int Mul(int a, int b){
        return a*b;
    }
}