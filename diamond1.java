class diamond1{
    public static void main(){
        for(int i=0;i<5;i++){
            System.out.print(" ");
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            for(int j=2;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}