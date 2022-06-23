package app;

import java.util.Scanner;

/**
 * @author vemaj
 *
 */
public class VampireAdventureApp {

    private static Scanner scanner = new Scanner(System.in);

    public static String trennstrich = "===========================================";


    /**
     * @param args mainklasse
     */
    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = readUserInput("\nBitte wähle eine Zahl zwischen 1 und 6:\t", von(1).bis(6));
            handle(choice);
            System.out.println(trennstrich);
        }
    }

    /**
     * 
     * @return 
     */
    private static int readUserInput(String abfrage, int von, int bis) {
        while (true) {
            System.out.print(abfrage);
        try{
             int eingabe = scanner.nextInt();
            if (von <= eingabe && eingabe <= bis) {
                return eingabe;
            else System.out.println("Bitte wähle eine Zahl zwischen " + von + " und " + bis + ".");

        }
        catch(Exception e){
            String falscheEingabe = scanner.nextLine();
            System.out.println("Bitte wähle eine Zahl zwischen " + von + " und " + bis + ".");
        }
      }
    }

    /**
     * 
     * @param choice
     */
    private static void handle(int choice) {
        switch (choice) {
            case 1:
                createVampire();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default: {
                System.out.println("Invalid input. Please choose a correct number between 1 and 6");
                showMenu();
            }
                break;

        }
    }

    /**
     * 
     */
    private static void showMenu() {

        String menuItems[] = { "", "(1)\t Create Vampire", "(2)\t Show Selected Vampire", "(3)\t List all Vampirs","(4)\t Delete Vampire","(5)\t Start Nightly Adventure","(6)\t Quit" };

        System.out.println("\nVampire Adventures 1.0\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }

    private static void createVampire() {
        System.out.println(
                "\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du einen Vampir anlegen.\n");
    }

}
