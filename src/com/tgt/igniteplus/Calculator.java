package com.tgt.igniteplus;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ans;
        int op, num1, num2;

        System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.remainder\n6.exponentiation");
        do {
            System.out.println("pick an option");

            op = in.nextInt();
            switch (op) {
                case 1:
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    while (num2 == 0) {
                        System.out.println("Divisor cant be zero.Enter another number");
                        num2 = in.nextInt();
                    }
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    num1 = in.nextInt();
                    num2 = in.nextInt();
                    while (num2 == 0) {
                        System.out.println("Divisor cant be zero.Enter another number");
                        num2 = in.nextInt();
                    }
                    System.out.println(num1 % num2);
                    break;


                case 6: num1 = in.nextInt();
                        num2 = in.nextInt();
                        System.out.println(Math.pow(num1, num2));
                        break;
                default:System.out.println("Enter a valid option");
                    }
                    System.out.println("do you wish to continue? : ");
                    ans = in.next().charAt(0);

            } while (ans == 'y' || ans == 'Y') ;
        }
    }

/*

1.addition
2.subtraction
3.multiplication
4.division
5.remainder
6.exponentiation
1
5 95
100
do you wish to continue? :
y
pick an option
2
68 111
-43
do you wish to continue? :
y
pick an option
3
23 0
0
do you wish to continue? :
y
pick an option
4
5 0
Divisor cant be zero.Enter another number
2
2
do you wish to continue? :
y
pick an option
5
5 2
1
do you wish to continue? :
y
pick an option
6
5 5
3125.0
do you wish to continue? :
y
pick an option
9
Enter a valid option
do you wish to continue? :
n
 */