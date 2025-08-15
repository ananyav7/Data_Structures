import java.util.*;
class Greater{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("Both are equal");
        }
        else if(num1>num2){
                System.out.println("num1 is greater");
        }
        else{
                System.out.println("num2 is greater");
        }
    }
}