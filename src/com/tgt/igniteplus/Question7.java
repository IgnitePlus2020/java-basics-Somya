package com.tgt.igniteplus;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        String str;
        Scanner in=new Scanner((System.in));
        str=in.nextLine();

        System.out.println(removeHyphenBetweenNums(str));
    }

    private static char[] removeHyphenBetweenNums(String str) {

        char[] s=str.toCharArray();
        char[] resultStr=new char[s.length];
        int len=0;
        for (int i = 0; i <s.length ; i++) {

            if (s[i]=='-' && Character.isDigit(s[i-1]) && Character.isDigit(s[i+1]) ) continue;
            resultStr[len++]=s[i];
        }

return resultStr;
    }
}
/*
134-10/5566 A-block,Manyata Tech-Park
13410/5566 A-block,Manyata Tech-Park
 */