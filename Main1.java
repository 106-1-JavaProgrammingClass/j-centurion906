package com.company;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        int n = scn.nextInt();

        System.out.println  ( ( double ) Math.round( v1*Math.pow(10 ,n) ) /Math.pow(10,n) );
    }
}