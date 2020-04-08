package com.tgt.igniteplus;
public class EmptyStringCheck {

   static Boolean checkEmptyString(String str){
       return str == null || str.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "abcdef";

        if(checkEmptyString(str1))
            System.out.println("empty string");
        else System.out.println("non empty string");

        if(checkEmptyString(str2))
            System.out.println("empty string");
        else System.out.println("non empty string");
    }
}