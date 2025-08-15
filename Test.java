public class Test {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;y -= z;
        System.out.println(x);
        System.out.println(y);
        z=z/(x+y);
        System.out.println(z);
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}