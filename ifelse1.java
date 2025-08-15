import java.util.*;
class ifelse1{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int no=sc.nextInt();
        if(no%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}