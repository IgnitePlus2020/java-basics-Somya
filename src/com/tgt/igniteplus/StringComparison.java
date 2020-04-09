package com.tgt.igniteplus;
/*
string comparison methods
 */
import java.util.Objects;
import java.util.Scanner;

public class StringComparison {
    /*
    If all the contents of both the strings are same then equals() returns true, it returns false.
     */
   static  Boolean stringComp1(String s1,String s2){
      return s1.equals(s2);

    }
    static  Boolean stringComp2(String s1,String s2){
       /*
        This method returns true if the argument is not null and the contents of both the Strings are same ignoring case, else false.
        */
        return s1.equalsIgnoreCase(s2);

    }
    static Boolean stringComp3(String s1,String s2){
       /*
      Object.equals(Object a, Object b) method returns true if the arguments are equal to each other and false otherwise.
      if both arguments are null, true is returned
        */
        return Objects.equals(s1,s2);

    }
    static  int stringComp4(String s1,String s2){
       /*
       value returned is 0 if strings are equal
       else difference b/w characters of  first point of difference is returned
        if (s1 > s2) : returns positive value().
        if both the strings are equal lexicographically
        i.e.(s1 == s2) : returns 0.
        if (s1 < s2) : returns a negative value.
        */
        return s1.compareTo(s2);

    }
    public  static void main(String []args){
        String s1,s2;
        Scanner in=new Scanner((System.in));
        s1=in.nextLine();
        s2=in.nextLine();
        System.out.println( stringComp1(s1,s2));
        System.out.println( stringComp2(s1,s2));
        System.out.println(stringComp3(s1,s2));
        System.out.println(stringComp4(s1,s2));




    }
}
/*
abc
abc
true
true
true
0
**************
abc
aBz
false
false
false
32
 */