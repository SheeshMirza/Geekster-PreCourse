import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}