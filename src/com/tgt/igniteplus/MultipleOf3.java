package com.tgt.igniteplus;
/*
Q. Largest Multiple of Three
Given an integer array of digits, return the largest multiple of three that can be formed by concatenating some of the
given digits in any order.Since the answer may not fit in an integer data type, return the answer as a string.
If there is no answer return an empty string.
Example 1:

Input: digits = [8,1,9]
Output: "981"
Example 2:

Input: digits = [8,6,7,1,0]
Output: "8760"
Example 3:

Input: digits = [1]
Output: ""
Example 4:

Input: digits = [0,0,0,0,0,0]
Output: "0"
 */
import java.util.*;


public class MultipleOf3 {

        public static String largestMultipleOfThree(int[] digits) {
        //if all elements are zeros return "0"
            int zeros=0;
            for (int i = 0; i <digits.length ; i++) {
                if (digits[i]==0)   zeros++;
            }
            if (zeros==digits.length)   return "0";

        /*
        sum
        rem=sum%3
        sort digits
        i=0,1,2
        qi=digit%3==i
        if rem==1
        dequeue q1 else dequeue q2 twice
        else if rem==2
        dequeue q2 else dequeue q1 twice

        combine q0,q1,q2,sort ,return
        */

            Queue<Integer> q0 = new LinkedList<>();
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();
            int sum = 0, remainder;

            //sorted
            Arrays.sort(digits);

          //add elements to queues based on remainder
            for (int i = 0; i < digits.length; i++) {
                sum += digits[i];
                if (digits[i] % 3 == 0)
                    q0.add(digits[i]);
                else if (digits[i] % 3 == 1)
                    q1.add(digits[i]);
                else if (digits[i] % 3 == 2)
                    q2.add(digits[i]);
            }

            //remainder of totSum%3
            remainder = sum % 3;
            if (remainder == 1) {
                if (q1.peek() != null)
                    q1.poll();
                else {
                    if (q2.peek() != null)
                        q2.poll();
                    else return null;
                    //remove another rem 2 ele
                    if (q2.peek() != null)
                        q2.poll();
                    else return null;
                }

                } else if (remainder == 2) {
                    if (q2.peek() != null)
                        q2.poll();
                    else {
                        if (q1.peek() != null)
                            q1.poll();
                        else return null;
                        //remove another rem 2 ele
                        if (q1.peek() != null)
                            q1.poll();
                        else return null;
                    }

                }
            //merging all queues
            Queue<Integer> result = new LinkedList<>();
            result.addAll(q0);
            result.addAll(q1);
            result.addAll(q2);


            //for sorting
            ArrayList list = new ArrayList(result);
            Collections.sort(list, Collections.reverseOrder());

            String str=list.toString();

            str=str.replace(", ","");
            str=str.replace("[","");
            str=str.replace("]","");

            return str;

        }
        //Driver code
        public static void main(String []args){
            Scanner in=new Scanner(System.in);

            int n;
            n=in.nextInt();
            int[] num=new int[n];
            for (int i = 0; i <n ; i++) {
                num[i]=in.nextInt();
            }

            System.out.println(largestMultipleOfThree(num));

        }

    }

