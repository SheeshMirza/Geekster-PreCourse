import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        if(side1==side2){
            System.out.print("Square");
        }else{
            System.out.print("Not a Square");
        }
    }
}