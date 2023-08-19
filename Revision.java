import java.util.*;
public class Revision {
    public static void main(String[] args){
        //taking input for no of rows and cols
        System.out.println("enter rows :");
        Scanner ac =new Scanner(System.in);
        int row=ac.nextInt();
        System.out.println("enter cols :");
        int cols=ac.nextInt();
        //taking input in array
        System.out.println("enter values for Array");
        int[][] array=new int [row][cols];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
            array[i][j]=ac.nextInt();
        }}
        //printing in 2d Array
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println();
        }

        System.out.println("Spiral transversal order of matrics:");
        int minr=0;
        int minc=0;
        int maxr= array.length-1;
        int maxc=array[0].length-1; int cnt=0; int total= row*cols;
        //left wall
        while(cnt<total) {
            for (int i = minr, j = minc; i <= maxr && cnt < total; i++) {
                System.out.print(array[i][j]+" ");
                cnt++;
            }
            minc++;
            //bottom wall
            for (int i = maxr,j = minc; j <= maxc && cnt < total; j++) {
                System.out.print(array[i][j]+" ");
                cnt++;
            }maxr--;

            //right wall
            for (int i = maxr, j = maxc; i >= minr && cnt < total; i--) {
                System.out.print(array[i][j]+" ");
                cnt++;
            }
            maxc--;
            //top wall
            for (int i = minr, j = maxc; j>= minc && cnt < total; j--) {
                System.out.print(array[i][j]+" ");
                cnt++;
            }minr++;
        }
    }
    }


