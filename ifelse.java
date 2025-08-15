import java.util.*;
class ifelse{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You're legal");
        }
        else{
            System.out.println("You are not legal.");
        }
    }
}