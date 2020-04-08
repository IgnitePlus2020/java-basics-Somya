package com.tgt.igniteplus;
/*
program  to check if a string contains only digits
 */
import java.util.Scanner;

public class IsNumber {
  static boolean checkIsNumber(String str){
       int i;


       for ( i = 0; i <str.length() ; i++) {
           if((char) str.charAt(i)>'0' && (char) str.charAt(i)<'9') continue;
           else return false;
       }
       return true;
    }
    public static void main(String[] args){
        String str="";

        Scanner in=new Scanner((System.in));
        str=in.next();
        if(checkIsNumber(str))  System.out.println("string contains only digits");
        else System.out.println("string contains characters other than digits");



    }
}
/*
2342434
string contains only digits
******************************
4354635r
string contains characters other than digits
******************************
#f40f01
string contains characters other than digits
 */
