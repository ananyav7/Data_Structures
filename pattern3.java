class pattern3{
    public static void main(){
        char a='a';
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}