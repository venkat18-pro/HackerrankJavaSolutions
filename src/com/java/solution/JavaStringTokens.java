package com.java.solution;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.length() == 0) {
        	System.out.println(0);
        }else {
        String[] tokens = s.split("[!,?.*_'@\\ ]+");
        int size = tokens.length;
        System.out.println(size);
        for(String token : tokens) {
        	System.out.println(token);
        }
        }
        scan.close();
    }
}
