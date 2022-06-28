import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                if(j<(n-i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}