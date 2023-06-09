package org.example;

import java.util.Scanner;

public class TaskManager {
    private Scanner scanner = new Scanner(System.in);

    public TaskManager(){
    }

    public void menu() {
        while (true) {
            System.out.println("Enter a command: (add, remove, mark, list, exit)");
            String command = scanner.nextLine();

            // add switch on command types

            if (command.equals("exit")){
                return;
            }
        }
    }
}
