package managers;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistoryCommand {
    Deque<String> historyCommands = new ArrayDeque<>(11);
    public void addCommand(String command){
        historyCommands.add(command);
    }

    public Deque<String> getHistoryCommands() {
        return historyCommands;
    }
}
