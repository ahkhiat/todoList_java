package models;

public class Task {

    private static int idCounter = 0;

    private int id;
    private String name;
    private String status;

    // Couleurs de police
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    public Task(String name) {
        this.id = ++idCounter;
        this.name = name;
        this.status = "En cours";
    }

    @Override
    public String toString() {
        String color;
        switch (status.toLowerCase()) {
            case "en cours":
                color = YELLOW;
                break;
            case "terminée":
                color = GREEN;
                break;
            default:
                color = RED;
                break;
        }
        return id + ". " + name + " " + color + "[" + status + "]" + RESET ;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
