package services;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskService {

    private final List<Task> tasks;

    public TaskService() {
        tasks = new ArrayList<>();
    }

    public void addTask(Scanner scanner) {
        System.out.println("Ajouter une nouvelle tâche");
        System.out.println();

        String name = scanner.nextLine();

        Task task = new Task(name);
        tasks.add(task);
    }

    public void markTaskDone(Scanner scanner) {
        System.out.println("Entrez l'id de la tâche à marquer comme terminée'");

        int choice = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Task task : tasks) {
            if (task.getId() == choice) {
                task.setStatus("Terminée");
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucune tâche trouvée avec cet id : " + choice);
        }
        System.out.println();
    }

    public void displayALlTasks(Scanner scanner) {
        System.out.println("-------------------------");
        System.out.println("Liste des tâches");
        System.out.println("-------------------------");

        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println();
    }

    public void deleteTask(Scanner scanner) {
        System.out.println("Entrez l'id de la tâche à supprimer'");

        int choice = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Task task : tasks) {
            if (task.getId() == choice) {
                tasks.remove(task);
                System.out.println("La tâche avec l'id " + choice + " a été suprrimée.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Aucune tâche trouvée avec cet id : " + choice);
        }
        System.out.println();
    }


}
