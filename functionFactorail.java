import java.util.*;
class functionFactorail{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial(n);
    }
    public static void Factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid Number");
        }
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}