class butterfly{
    public static void main(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<4-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<4-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=5;i++){
            for(int j=0;j<4-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}