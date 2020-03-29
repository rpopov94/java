package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 sum \n"+"2 delta\n"+"3 mult\n" + "4 div\n");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        System.out.println("Введите 1 число");
        int a = scanner.nextInt();
        System.out.println("введите второе число");
        int b = scanner.nextInt();
        if(op == 1){
            System.out.println(a+b);
        } else if (op == 2){
            System.out.println(a-b);
        } else if (op == 3){
            System.out.println(a*b);
        } else if(op == 4){
            if(b != 0)
                System.out.println(a/b);
            else{
                System.out.println("error! divided by zero!");
                System.exit(-1);
            }
        }
	  scanner.exit();
    }
}
