import java.util.*;
class Greeting{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");
                break;
            case 3:
                System.out.println("Oyee");
                break;
            case 4:
                System.out.println("Namaste");
                break;
            case 5:
                System.out.println("Whatsup");
                break;
            default:
                System.out.println("Chall hatt");
        }
    }
}