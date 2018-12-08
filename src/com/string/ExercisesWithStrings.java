package com.string;

import java.util.Scanner;

public class ExercisesWithStrings {

    //1.Să se citească un şir de caractere de la tastatură. Să se afişeze caracterul de pe prima poziţie şi de
    //pe ultima poziţie.

    public void firstAndLastCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirul de caractere este: ");

        String sirDeCaractere = scanner.next();
        char primulCaracter = sirDeCaractere.charAt(0);
        char ultimulCaracter = sirDeCaractere.charAt(sirDeCaractere.length()-1);
        System.out.println("Primul caracter este " + primulCaracter + " iar ultimul este " + ultimulCaracter);
    }

    //2.Să se concateneze 2 şiruri de caractere citite de la tastatură şi să se afişeze rezultatul.
    // Ce opţiuni aveţi?

    public void concatenation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primul sir este: ");
        String primulSir = scanner.next();

        System.out.println("Al doilea sir este: ");
        String alDoileaSir = scanner.next();

        String concatenareaSirurilor = primulSir.concat(alDoileaSir);
        System.out.println("Sirul concatenat este: " + concatenareaSirurilor);
    }

    //3.Se citesc 2 şiruri de caractere de la tastatură. Să se afişeze dacă acestea sunt sau nu egale.

    public void compareStrings() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primul sir este: ");
        String primulSir = scanner.next();

        System.out.println("Al doilea sir este: ");
        String alDoileaSir = scanner.next();

        boolean egalitateaCelorDouaSiruri = primulSir.equals(alDoileaSir);
        System.out.println("Egalitatea celor doua siruri: " + egalitateaCelorDouaSiruri);

    }

    //4.Se citesc 2 şiruri de caractere. Să se verifice dacă primul şir îl conţine pe al doilea (Ex:
    //“Programare” conţine “mare”).

    public void containsPartOfWord(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("First row of characters is: ");
        String firsRow = scanner.next();

        System.out.println("Second row of characters is: ");
        String secondRow = scanner.next();

        boolean containsOfWord = firsRow.contains(secondRow);
        System.out.println("Firs word contains the second word? " + containsOfWord);
    }

    //5.Se citeşte un şir de caractere de la tastatură. Să se afişeze indexul caracterului 'a'. Ce se va afişa
    //dacă şirul introdus nu conţine caracterul 'a'?

    public void characterIndex() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirul tau de caractere este: ");

        String sirDeCaractere = scanner.next();
        int index = sirDeCaractere.indexOf('a');
        System.out.println("'a' se afla pe pozitia " + index);
    }

    //6.Să se citească un şir de caractere de la tastatură. Să se afişeze primul caracter.

    public void firstCharacter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirul de caractere este: ");
        String firstCharacter = scanner.next();

        char firstCharacters = firstCharacter.charAt(0);
        System.out.println("Primul caracter este: " + firstCharacters);


    }

    //7.Să se întrebe utilizatorul dacă mai vrea suc. Acesta trebuie să răspundă cu Y sau N. Să se
    //folosească o variabilă de tip char.

    public void questionForUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want more juice? ");
        String juice = scanner.next();
        //char answerQuestion = juice
    }

    //8.Se citeşte de la tastatură un şir de caractere.
    // Să se găsească o metodă care returnează lungimea acestuia şi să se afişeze.

    public void rowOfCharacter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirul de caractere este: ");
        String sir = scanner.next();
        int lungimeaSirului = sir.length();
        System.out.println("Sirul " + sir + " are lungimea de " + lungimeaSirului + " caractere." );

    }

    //9.Să se citească 2 şiruri de caractere. Să se concateneze folosind o metodă şi să se afişeze.

    public void concatenateTwoRows(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First row of characters is: ");
        String firsRow = scanner.next();

        System.out.println("Second row of characters is: ");
        String secondRow = scanner.next();

        String concatenationOfTwoRows = firsRow.concat(secondRow);
        System.out.println("The concatenation of the two rows is: " + concatenationOfTwoRows);
    }

    //10.Să se compare 2 şiruri de caractere citite de la tastatură. Comparaţia să se facă ţinând cont de
    //caracterele majuscule (MARE este egal cu MARE, dar nu este egal cu Mare), apoi ignorând-ule
    //(Mare este egal şi cu MARE şi cu mArE).

    public void wordsWithUppercase(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your first row: ");
        String firstRow = scanner.next();

        System.out.println("Your second row: ");
        String secondRow = scanner.next();
        boolean theWordsAreEquals = firstRow.equals(secondRow);
        System.out.println("The words are Equal: " + theWordsAreEquals);
        boolean theWordsAreEqualsIgnoreCase = firstRow.equalsIgnoreCase(secondRow);
        System.out.println("The words are equal wit ignore case: " + theWordsAreEqualsIgnoreCase);

    }

    //11.Se citeşte un şir de caractere de la tastatură. Să se verifice dacă acesta se termină cu “ala”.

    public void wordEndsWith(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the row: ");
        String row = scanner.next();

        boolean endsWith = row.endsWith("ala");
        System.out.println("The row you enter ends with 'ala'? " + endsWith);
    }

    //12.Se citeşte un şir de caractere şi un caracter. Să se verifice dacă caracterul se află în şir, prin
    //poziţia sa.

    public void indexOfChar(){
        Scanner scanner = new Scanner(System.in);
    }


    //13.Să se citească un şir de caractere şi să se afişeze câte caractere conţine.

    public void howManyCharacterContains(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your row: ");
        String theNumberOfCharacter = scanner.next();

        int index = theNumberOfCharacter.length();
        System.out.println("The row contains " + index + " characters.");
    }

    //14.Să se inlocuiască un caracter dintr-un şir cu altul. Se vor citi pe rând şirul şi cele 2 caractere.

    public void replaceChar(){

        Scanner scanner = new Scanner(System.in);

    }

    //15.Să se verifice dacă un şir de caractere începe cu un alt şir de caractere (Ex: Lanterna începe cu
    //Lan). Se vor citi cele 2 şiruri de caractere.

    public void beginsWith(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("The row is: ");
        String beginsWithChar = scanner.next();

        boolean begins = beginsWithChar.startsWith("io");
        System.out.println("The row starts with: " + begins);
    }

    //16.Să se şteargă spaţiile albe de la începutul şi sfârşitul unui şir de caractere introdus. De exemplu: “
    //asd ” va deveni “asd”.

    public void wordsWithoutBlankSpaces(){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter your row: ");
        String yourRow = scanner.next();

        String blankSpace = yourRow.trim();
        System.out.println(blankSpace);

    }

    //17.Să se convertească caracterele unui şir de caractere introdus în litere mari, apoi în litere mici. (Ex:
    //pentru “MiercuRi” se va afişa pe rând “MIERCURI” şi “miercuri”).

    public void convertLettersToUppercase(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your row with uppercase/lowercase letters: ");
        String uppercaseLetters = scanner.next();

        String theLetters = uppercaseLetters.toUpperCase();
        String theOtherLetters = uppercaseLetters.toLowerCase();
        System.out.println("Uppercase: " + theLetters + " and Lowercase: " + theOtherLetters);


    }
    
}
