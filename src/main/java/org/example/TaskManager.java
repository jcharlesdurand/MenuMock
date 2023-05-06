package org.example;

public class TaskManager {
    private ApplicationConsole applicationConsole;

    public TaskManager(ApplicationConsole applicationConsole){
        this.applicationConsole = applicationConsole;
    }

    public void menu() {
        while (true) {
            applicationConsole.showMessage("Enter a command: (add, remove, mark, list, exit)");
            String command = applicationConsole.readLine();

            // add switch on command types

            if (command.equals("exit")){
                return;
            }
        }
    }
}
