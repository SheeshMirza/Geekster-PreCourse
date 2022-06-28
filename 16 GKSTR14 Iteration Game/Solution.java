import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(i%2==0){
                System.out.println(a+b);
            }else{
                System.out.println(a*b);
            }
        }
    }
}