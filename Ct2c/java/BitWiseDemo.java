package org.tns.capgemini.c2tc.java;

public class BitWiseDemo {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        System.out.println("a & b: " + (a & b));  // 0001 = 1

        // Bitwise OR
        System.out.println("a | b: " + (a | b));  // 0111 = 7

        // Bitwise XOR 
//The XOR operator (^) compares two bits.
//The result is 1 if the bits are different, and 0 if the bits are the same.
        System.out.println("a ^ b: " + (a ^ b));  // 0110 = 6

        // Bitwise NOT
        System.out.println("~a: " + (~a));  // Inverts all bits, result depends on system

        // Left shift
        System.out.println("a << 2: " + (a << 2));  // 0101 becomes 10100 = 20
    //multiples a number by 2^b  5*2^2 ->5*4 =20
       
        
        // Right shift
        System.out.println("a >> 2: " + (a >> 2));  // 0101 becomes 0001 = 1
        //divide the number by 2^b   5/2^2-> 5/4 =1
    }
}
