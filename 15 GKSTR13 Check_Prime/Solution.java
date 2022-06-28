import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=2; i<(n/2)+1; i++){
            if(n%i==0){
                System.out.print("Not a Prime");
                return;
            }
        }
        if(n>1){
            System.out.print("Prime");
        }else{
            System.out.print("Not a Prime");
        }
    }
}