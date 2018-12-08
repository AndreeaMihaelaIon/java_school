package com.conditionalStructure;

import java.util.Scanner;

public class WhileCondition {

    Scanner scanner = new Scanner(System.in);
    //1.Salvează o valoare între 1 şi 10 într-o variabilă. Încearcă să ghiceşti numărul prin introducerea unei
    //valori de la tastatură. Afişează mesaje diferite dacă numărul este mai mare, mai mic sau dacă l-ai
    //ghicit.

    public void guessTheNumber(){

        int number = 9;
        System.out.println("Ghiceste numarul: ");
        int guessNumber = scanner.nextInt();
        while(guessNumber != number){
            System.out.println("Nu ai ghicit numarul!");
            if(number>guessNumber){
                System.out.println("Numarul este mai mare!");
            }else{
                System.out.println("Numarul este mai mic!");
            }
            guessNumber = scanner.nextInt();
        }
        System.out.println("Ai ghicit numarul!");
    }

    //2.Scrie un program care să facă suma unor numere întregi introduse de la tastatură. Suma va fi
    //afişată la fiecare pas. Programul se va opri când se va introduce valoarea 0.

    public void sumOfNumbers(){

        int sum = 0;
        while(true){
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }
            sum += number;
            System.out.println("The partial sum is: " + sum);
        }
        System.out.println("The final sum is: " + sum);
    }

    //3.Introdu un număr întreg de la tastatură. Afişează cifrele acestuia.

    public void findNumbers(){
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        while(number != 0){
            int numbers = number%10;
            number = number/10;

            System.out.println("The numbers are: " + numbers);
        }
    }


}
