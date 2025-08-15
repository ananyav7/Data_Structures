class hollow_rhombus{
    public static void main(){
        for(int i=0;i<5;i++){
            for(int j=1;j<4-i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                if(i==0||i==4||j==0||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}