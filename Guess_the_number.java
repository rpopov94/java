package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number!");
        int range = 10;
        int number = (int) (Math.random()* range);
        while (true){
            System.out.println("guess the number from 0 to" + range);
            int input_num = sc.nextInt();
            if(input_num == number){
                System.out.println("You win!");
                break;
            }
        }
    }
}
