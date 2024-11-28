package services;
import java.util.Scanner;

public class Home {

    private final Scanner scanner;
    private final TaskService taskManager;
    private final MenuDisplay menuDisplay;

    public Home(TaskService taskManager, Scanner scanner) {
        this.taskManager = taskManager;
        this.scanner = scanner;
        this.menuDisplay = new MenuDisplay(scanner);
    }

    public  void homeMenu() {

        boolean running = true;

        while(running) {

            // Affichage du menu d'accueil
            menuDisplay.showMenu();

            String choice = menuDisplay.getUserChoice();

            // Ajouter une tâche
            if (choice.equals("1")) {
                boolean runAddTask = true;

                while (runAddTask) {
                    taskManager.addTask(scanner);
                    System.out.println("1 -> Entrer une nouvelle tâche");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueAdd = scanner.nextLine();

                    if (!continueAdd.equals("1")) {
                        runAddTask = false;
                    }
                }
            }

            // Rechercher un contact
            else if (choice.equals("2")) {
                boolean runMarkTask = true;

                while (runMarkTask) {
                    taskManager.displayALlTasks(scanner);
                    taskManager.markTaskDone(scanner);
                    System.out.println("1 -> Marquer une autre tâche");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueSearch = scanner.nextLine();

                    if (!continueSearch.equals("1")) {
                        runMarkTask = false;
                    }
                }
            }

            // Afficher toutes les tâches
            else if (choice.equals("3")) {
                boolean runDisplayAllTasks = true;

                while (runDisplayAllTasks) {
                    taskManager.displayALlTasks(scanner);
                    System.out.println("1 -> Lister les tâches à nouveau");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueDisplay = scanner.nextLine();

                    if (!continueDisplay.equals("1")) {
                        runDisplayAllTasks = false;
                    }
                }

            }
            // Supprimer une tâche
            else if (choice.equals("4")) {
                boolean runDeleteTask = true;

                while(runDeleteTask) {
                    taskManager.displayALlTasks(scanner);
                    taskManager.deleteTask(scanner);

                    System.out.println("1 -> Supprimer une autre tâche");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueDelete = scanner.nextLine();
                    System.out.println("A bientôt");

                    if (!continueDelete.equals("1")) {
                        runDeleteTask = false;
                    }
                }

            }
            else if (choice.equals("5")) {
                System.out.println("-----------------------------");
                System.out.println("A bientôt");
                running = false;
            }
        }
    }
}
