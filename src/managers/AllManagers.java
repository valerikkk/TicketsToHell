package managers;

import java.util.Scanner;

public class AllManagers {
    static AllManagers managers;
    CommandManager commandManager;
    CollectionManager collectionManager;
    Scanner scanner;
    ConsoleManager consoleManager;
    AllManagers(){
    }
    public static AllManagers createAllManagers(){
        if(managers==null){
            managers = new AllManagers();
        }
        return managers;
    }
    public CommandManager getCommandManager() {
        return commandManager;
    }
    public void setCommandManager(CommandManager commandManager) {
        this.commandManager = commandManager;
    }
    public CollectionManager getCollectionManager() {
        return collectionManager;
    }
    public void setCollectionManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public ConsoleManager getConsoleManager() {
        return consoleManager;
    }
    public void setConsoleManager(ConsoleManager consoleManager) {
        this.consoleManager = consoleManager;
    }
    public static AllManagers getManagers() {
        return managers;
    }
}
