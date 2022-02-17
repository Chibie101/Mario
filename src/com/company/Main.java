package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type an integer: ");
        int n = input.nextInt();
        while (n < 1 || n > 8) {
            System.out.println("Type an integer: ");
            n = input.nextInt();
        }
        for (int i = 0; i <= n; i = i + 1) {
            for (int j = 0; j < n-i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j = j+ 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}