package com.tgt.igniteplus;
/*
prig to find length of String without built in func
 */
import java.util.Scanner;

public class StringLength {
    static int findStringLength(String s) {
        return  s.length();
    }

    public static void main(String[] args){
        String str;
        Scanner in=new Scanner((System.in));
        str=in.nextLine();

        System.out.println(findStringLength(str));

    }
}
/*
abc def
7
 */