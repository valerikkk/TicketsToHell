package commands;

import managers.TicketsDatabase;

public abstract class Command {
    private String consoleName;
    private String description;
    private TicketsDatabase ticketsDatabase;
    public Command(String consoleName, String description){
        this.consoleName = consoleName;
        this.description = description;
    }
    public String getConsoleName() {
        return consoleName;
    }

    public String getDescription() {
        return description;
    }
}
