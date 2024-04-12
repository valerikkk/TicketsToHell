import managers.CollectionManager;
import models.Ticket;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
<<<<<<< HEAD
    public void write(CollectionManager coll){
=======
    public void write(Ticket... ticket){
        for (Ticket tickets:ticket) {
            String toWrite = tickets.fileToString();

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
        try(FileOutputStream out=new FileOutputStream("notes.csv");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // перевод строки в байты
            byte[] buffer = coll.toString().getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    }
}
