import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        if(h>24){
            System.out.print("invalid input");
        }else if(h>20 && h<=24){
            System.out.print("good night");
        }else if(h>16 && h<=20){
            System.out.print("good evening");
        }else if(h>=12 && h<=16){
            System.out.print("good afternoon");
        }else if(h<12){
            System.out.print("good morning");
        }
    }
}