//import services.ContactService;
import services.Home;
import services.TaskService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskService taskManager = new TaskService();
        Home displayHome = new Home(taskManager, scanner);

        displayHome.homeMenu();

    }

}
