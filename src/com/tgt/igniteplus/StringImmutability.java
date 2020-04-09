package com.tgt.igniteplus;
//program demonstrating immutability of Strings

public class StringImmutability {

    public static void main(String[] args){
        String s1="hello";
        String s2=s1;   //s1 and s2 point to same string object "hello"

        System.out.println("before\ns1 : "+s1+"\ts2 : "+s2);

       //s1.charAt(1)='h';   // can make s1 reference point to other object but can't modify the string object pointed to by s1 !!

        s2=s2.concat(" world"); //can make a reference point to another object .now s2 points to "hello world"
        System.out.println("after\ns1 : "+s1+"\ts2 : "+s2);//its possible to


    }
}
/*
before
s1 : hello	s2 : hello
after
s1 : hello	s2 : hello world
 */