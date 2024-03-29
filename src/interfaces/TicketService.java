package interfaces;

import managers.TicketsDatabase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public interface TicketService {
    public Vector<TicketsDatabase> read(String filename) throws IOException;
    public void write();
}
