package com.tgt.igniteplus;
/*
removal of a cahracter from a string
 */
import java.util.*;

public class CharacterRemoval {

    private static String removeCharacter(String str, char key) {
        String smallCaseKey,upperCaseKey;

       if(key>='a' && key<='z') {
            smallCaseKey=Character.toString(key);
            upperCaseKey=Character.toString((char)(key-32));
        }

        else {
           smallCaseKey=Character.toString((char)(key+32));
           upperCaseKey=Character.toString(key);
        }

        str=str.replaceAll(smallCaseKey,"");
        str=str.replaceAll(upperCaseKey,"");

        return  str;
    }


    public static void main(String[] args){
        String str;
        char key;
        Scanner in=new Scanner((System.in));
        str=in.nextLine();
        key=in.nextLine().charAt(0);
        System.out.println(removeCharacter(str,key));
    }
}
/*
To test this string
t
o es his sring
 */