import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {
	
    public static void main(String[] args) {
//    	目的：打印键盘输入的int，double，String字符串连接三种类型的S和以下数据的和
       
    	int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        Integer inputinteger = scan.nextInt();
        Double inputdouble = scan.nextDouble();
        
        scan.nextLine();
        String inputString = scan.nextLine();
        
        System.out.println(inputinteger + i);
        System.out.println(inputdouble + d);
        System.out.println(s + inputString);
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
 }