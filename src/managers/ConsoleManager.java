package managers;

import exceptions.NoSuchCommandException;

import java.util.Scanner;

public class ConsoleManager {
    private Scanner scanner;
    private CommandManager cmd;
    public ConsoleManager(Scanner scanner, CommandManager cmd){
        this.scanner = scanner;
        this.cmd = cmd;
    }
    public void runFromConsole(){
        String income;
        while (true) {
            income = scanner.nextLine().trim().toLowerCase();
            try {
                cmd.callCommand(income);
            }catch(NoSuchCommandException ex){
                System.out.println("Команда с таким названием не найдена");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите один из предложенных вариантов");
            }
        }
    }

}
