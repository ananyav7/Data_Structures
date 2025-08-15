class linear_search{
    public static void main(){
        int numbers[]={10,20,30,40,50,60,70,80,90};
        int key=50;
        
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
                System.out.println("Value found at position: "+i);
            }
        }
    }
}