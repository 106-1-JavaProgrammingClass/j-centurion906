package com.company;

import java.util.Scanner;

public class circleA {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        System.out.println((double)Math.round(Math.PI*Math.pow(r,2))*h);
    }
}
