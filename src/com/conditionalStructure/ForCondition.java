package com.conditionalStructure;

import java.util.Scanner;

public class ForCondition {

    Scanner scanner = new Scanner(System.in);

    //1.Scrie un program care afişează mesajul "I KNOW JAVA!!!!" de 10 ori. Numerotează fiecare afişare a
    //mesajului.

    public void displayTheMessage(){

        for(int i=1; i<=10; i++){
            System.out.println(i + ": I know java!");
        }
    }

    //2.Scrie un program care citeşte un număr întreg şi numără de la 0 până la acesta. (0 1 2 3 …)

    public void readNumber(){

        System.out.println("The number you enter is: ");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println(i + ": Number: " + number);

        }
    }

    //3.Scrie un program care citeşte un număr şi afişează toate numele până la acesta. Programul va
    //afişa un semn în dreptul numerelor pare şi alt semn în dreptul numerelor impare.

    public void parAndImpar(){

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        for (int i = 0; i<number; i++){
            if(i % 2 == 0){
                System.out.println("Par * " + i);
            }else{
                System.out.println("Impar ^ " + i);
            }
        }
    }

    //4.Scrie un program care adună n numere citite de la tastatură (n este şi el citit de la tastatură). De
    //exemplu: a + b + c + d + …. + k.

    public void addingNumbers(){

        System.out.println("How many numbers do you adding?");
        int numbers = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < numbers; i++) {
            System.out.println("Enter the next number: ");
            int numar = scanner.nextInt();
            sum += numar;
        }
        System.out.println("The sum is: " + sum);
    }
}
