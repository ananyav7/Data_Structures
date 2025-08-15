import java.util.*;
class SpiralMatrix{
    public static void printSpiral(int matrix[][]){
        int srow=0;
        int scol=0;
        int erow=matrix.length-1;
        int ecol=matrix[0].length-1;
        
        while(srow<= erow&&scol<=ecol){
            for(int j=scol; j<=ecol; j++){
                System.out.print(matrix[srow][j]+" ");
            }
            for(int i=srow+1; i<=erow; i++){
                if(srow==erow){
                    return;
                }
                System.out.print(matrix[i][ecol]+" ");
            }
            for(int j=ecol-1; j>=scol; j--){
                if(scol==ecol){
                    return;
                }
                System.out.print(matrix[erow][j]+" ");
            }
            for(int i=erow-1; i>=srow; i--){
                System.out.print(matrix[i][scol]+" ");
            }
            scol++;
            srow++;
            ecol--;
            erow--;
        }
        System.out.println();
    }
    public static void main(){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(matrix);
    }
}