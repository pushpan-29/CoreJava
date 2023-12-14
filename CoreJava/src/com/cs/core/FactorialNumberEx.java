package com.cs.core;

import java.util.Scanner;

public class FactorialNumberEx {

    public static void main(String[] args) {


        System.out.println("please Enter number:");

        Scanner sc = new Scanner(System.in);
        int fact=1,n= sc.nextInt();

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        System.out.println("Factorial Result:"+fact);

    }
}
