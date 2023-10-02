package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Sayı Giriniz:");
        number=input.nextInt();
        double result=0.0;
        for(double i=1; i<=number; i++){
            result+=(1/i);
        }
        System.out.println("Sonuç:"+" "+result);
    }
}
