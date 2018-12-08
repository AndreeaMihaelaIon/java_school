package com.conditionalStructure;

import java.util.Scanner;

public class IfCondition {

    Scanner scanner = new Scanner(System.in);

    //1.Creează un program care cere vârsta de la tastatură. În funcţie de vârsta introdusă, să se afişeze
    //un mesaj dacă utilizatorul este minor sau nu.

    public void yourAge() {
        System.out.println("Your age is: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are a grown up!");
        } else {
            System.out.println("You are a minor!");
        }
    }

    //2.Creează un program care să afişeze unul din următoarele mesaje pentru o vârstă introdusă de la
    //tastatură. Testează programul cu toate variantele.
    //a. vârsta e mai mică ca 16, scrie "Nu poti conduce."
    //b. vârsta e mai mică ca 18, scrie "Nu poti vota."
    //c. vârsta e mai mică ca 25, scrie "Nu poti inchiria masini."
    //d. vârsta e 25 sau mai mare, scrie "Poti sa faci orice este legal."

    public void driverLicense() {
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("I can't drive!");
        } else if (age < 18) {
            System.out.println("I can't vote!");
        } else if (age < 25) {
            System.out.println("I can't rent a car!");
        } else {
            System.out.println("I can do whatever I want!");
        }
    }

    //3.Introdu un număr între 1 şi 7 de la tastatură. Afişează denumirea zilei corespuzătoare numelui
    //introdus (1 – Luni, 2 – Marti, etc.)

    public void daysOfWeek() {
        System.out.println("Enter a number that correspond with day of week: ");
        int numberOfDay = scanner.nextInt();

        if (numberOfDay == 1) {
            System.out.println("It's Monday!");
        } else if (numberOfDay == 2) {
            System.out.println("It's Tuesday");
        } else if (numberOfDay == 3) {
            System.out.println("It's Wednesday");
        } else if (numberOfDay == 4) {
            System.out.println("It's Thursday");
        } else if (numberOfDay == 5) {
            System.out.println("It's Friday");
        } else if (numberOfDay == 6) {
            System.out.println("It's Saturday");
        } else if (numberOfDay == 7) {
            System.out.println("It's Sunday");
        } else {
            System.out.println("There are 7 days in a week!");

        }
    }

    //4.Se citesc 2 şiruri de caractere de la tastatură. Să se compare şi să se afişeze dacă sunt egale sau
    //nu. Atenţie, comparaţia între şiruri de caractere NU se face cu operatorul ==!

    public String compareTwoRowsOfCharacters() {
        System.out.println("Enter rows: ");
        String rows = scanner.next();
//        if (rowOne.equals(rowTwo)){
//            System.out.println("The rows are equals!");
//        }else{
//            System.out.println("You enter different rows!");
//        }
        return rows;
    }
}
