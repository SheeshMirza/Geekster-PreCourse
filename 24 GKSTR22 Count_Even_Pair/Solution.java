import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=1; i<=n; i++){
            array[i-1] = i;
        }
        int counts = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((array[i]+array[j])%2==0){
                    counts++;
                }
            }
        }
        System.out.print(counts);
    }
}