package managers;

import exceptions.NoSuchCommandException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The type Console manager.
 */
public class ConsoleManager {
    private Scanner scanner;
    private CommandManager cmd;
    /**
     * An array of tokens derived from splitting a user's string.
     */
    String[] tokens;

    /**
     * Instantiates a new Console manager.
     *
     * @param scanner the scanner
     * @param cmd     the cmd
     */
    public ConsoleManager(Scanner scanner, CommandManager cmd) {
        this.scanner = scanner;
        this.cmd = cmd;
    }

    /**
     * Run from the console to convert a string entered by the user.
     */
    public void runFromConsole() {
        String income;
        try {
            AllManagers.getManagers().getCommandManager().callCommand("help");
            while (true) {
                if(AllManagers.counterOfErrors==3){
                    System.err.println("Слишком много неправильных попыток. BYE-BYE!");
                    System.exit(112);
                    AllManagers.counterOfErrors=0;
                }
                income = scanner.nextLine().trim().toLowerCase();
                tokens = income.split(" ");
                try {
                    if (cmd.getCommands().get(tokens[0]).isComposite().equalsIgnoreCase("NO")) {
                        if (!tokens[tokens.length-1].isEmpty() && tokens.length>1){
                            throw new NoSuchCommandException();
                        }
                    }
                    cmd.callCommand(tokens[0]);
                } catch (NoSuchCommandException ex) {
                    ex.getMessage();
                    AllManagers.counterOfErrors++;
                }catch (NullPointerException ex){
                    System.out.println("Команда с таким названием не найдена");
                    AllManagers.counterOfErrors++;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("А команда exit для тебя шутка?");
        } catch (NoSuchCommandException ex){
            ex.getMessage();
        }
    }

    /**
     * Get tokens array [].
     *
     * @return the string [ ]
     */
    public String[] getTokens() {
        return tokens;
    }
    public void setTokens(String[] tokens) {
        this.tokens = tokens;
    }
}

