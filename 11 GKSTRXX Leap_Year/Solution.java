import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.print("Leap Year");
        }else if(year%400==0){
            System.out.print("Leap Year");
        }else{
            System.out.print("Not a Leap Year");
        }
    }
}