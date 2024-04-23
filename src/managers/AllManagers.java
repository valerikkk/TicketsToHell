package managers;
import java.util.Scanner;

public class AllManagers {
    static AllManagers managers;
    CommandManager commandManager;
    CollectionManager collectionManager;
    Scanner scanner;
    ConsoleManager consoleManager;
    CSVparser csvParser;
    FileWriter fileWriter;
    HistoryCommand historyCommand;
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

    public CSVparser getCsvParser() {
        return csvParser;
    }

    public void setCsvParser(CSVparser csvParser) {
        this.csvParser = csvParser;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public HistoryCommand getHistoryCommand() {
        return historyCommand;
    }

    public void setHistoryCommand(HistoryCommand historyCommand) {
        this.historyCommand = historyCommand;
    }
}
