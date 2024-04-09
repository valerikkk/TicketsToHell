package commands;

public abstract class Command{
    private String nameInConsole;
    private String description;
    public Command(String nameInConsole, String description) {
        this.nameInConsole = nameInConsole;
        this.description = description;
    }
    public abstract void run();
    public String getNameInConsole() {
        return nameInConsole;
    }
    public String getDescription() {
        return description;
    }
}