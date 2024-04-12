package commands;

public abstract class Command{
    private final String nameInConsole;
    private final String description;
    private final String isComposite;
    public Command(String nameInConsole, String description, String typeCommand) {
        this.nameInConsole = nameInConsole;
        this.description = description;
        this.isComposite = typeCommand;
    }
    public abstract void run();
    public String getNameInConsole() {
        return nameInConsole;
    }
    public String getDescription() {
        return description;
    }

    public String isComposite() {
        return isComposite;
    }
}