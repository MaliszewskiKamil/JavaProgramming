package Hackerrank;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] holder = new int[n];
            int temp = 1;
            for(int j = 0; j<n; j++){
                if(j==0){
                    holder[j] = a+temp*b;
                    continue;
                }
                temp = temp*2;
                holder[j] = holder[j-1]+temp*b;
            }
            for(int j = 0; j<holder.length; j++){
                System.out.print(holder[j]+" ");
            }
        }
        in.close();
    }
}
