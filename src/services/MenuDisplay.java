package services;

import java.util.Scanner;

public class MenuDisplay {

    private final Scanner scanner;

    public MenuDisplay(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        System.out.println("*****************************");
        System.out.println("***       TODO LIST       ***");
        System.out.println("*****************************");
        System.out.println("1 -> Ajouter un tâche");
        System.out.println("2 -> Marquer une tâche comme terminée");
        System.out.println("3 -> Afficher les tâches");
        System.out.println("4 -> Supprimer une tâche");
        System.out.println("5 -> Quitter");
    }

    public String getUserChoice() {
        System.out.print(" : ");
        return scanner.nextLine();
    }
}