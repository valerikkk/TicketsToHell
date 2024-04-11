package managers;

import exceptions.NoSuchCommandException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleManager {
    private Scanner scanner;
    private CommandManager cmd;
    String[] tokens;

    public ConsoleManager(Scanner scanner, CommandManager cmd) {
        this.scanner = scanner;
        this.cmd = cmd;
    }

    public void runFromConsole() {
        String income;
        try {
            while (true) {
                income = scanner.nextLine().trim().toLowerCase();
                tokens = income.split(" ");
                try {
                    if (cmd.getCommands().get(tokens[0]).isComposite().equalsIgnoreCase("NO")) {
                        if (!tokens[1].isEmpty()){
                            throw new NoSuchCommandException();
                        }
                    }
                    cmd.callCommand(tokens[0]);
                } catch (NoSuchCommandException ex) {
                    System.out.println("Команда с таким названием не найдена");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("А команда exit для тебя шутка?");
        }
    }

    public String[] getTokens() {
        return tokens;
    }
}

