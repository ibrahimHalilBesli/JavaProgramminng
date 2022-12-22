package day09_IfStatements;

public class ChooseLanguage {
    /*
    Creata a class called ChooseLanguage, Given an integer variable named
selection that has a number between 1~5, Write a program that can
select the language based on the number that's given in selection and
prints the following message:
for 1: Hello, thank for your call
for 2: Hola, gracias para llamar
for 3: Merhaba, aradiginiz icin tesekkurler
for 4: Privet, spasibo za vash zvonok
for 5: Merci ,pour votre appel
     */
    public static void main(String[] args) {

        int number = 1;
        String language = "";

        if (number == 1) {
            language = "Hello, thank for you call";

        } else if (number == 2) {
            language = "Hola, gracias para llamar";
        } else if (number == 3) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        } else if (number == 4) {
            language = "Privet, spasibo za vash zvonok";
        } else if (number == 5) {
            language = "Merci, pour votre appel";
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(language);
    }
}
