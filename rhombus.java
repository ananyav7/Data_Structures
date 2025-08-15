class rhombus{
    public static void main(){
        for(int i=0;i<5;i++){
            for(int j=1;j<4-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}