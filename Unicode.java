package com.company;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        System.out.println(Integer.toHexString(ch));

    }
}
