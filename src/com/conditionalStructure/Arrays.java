package com.conditionalStructure;

import java.util.Scanner;

public class Arrays {
        Scanner scanner = new Scanner(System.in);

    //1.Creează un vector cu 5 elemente, pune valori în toate poziţiile şi afişează elementele de pe
    //poziţiile 1, 2 şi 4.

    public void vectorOfArray(){
        int[]vector = new int [5];
        vector[0] = 2;
        vector[1] = 5;
        vector[2] = 8;
        vector[3] = 10;
        vector[4] = 13;

        System.out.println("The value on position 1, 2 and 4 is: one: " + vector[1] + ", two: " + vector[2] + ", four: " + vector[4]);

    }

    //2.Creează un vector care reţine 1000 de valori. Pune în el diverse valori. Afişează vectorul, apoi
    //afişează doar numerele cu 0 în coadă (ex: 10, 20, 30, etc…).

    public void vectorWithValues() {

        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i] + " ");
//        }
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 10) == 0) {
                System.out.println(numbers[i] + " ");
            }
        }
    }

    //3.Creează un array de 10 elemente în care să introduci numere citite de la tastatură. Calculează
    //suma elementelor şi afişeaz-o.

    public void sumOfTheArray(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the number: ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The sum is " + sum);
    }

}
