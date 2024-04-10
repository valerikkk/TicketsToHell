<<<<<<< HEAD
import models.Coordinates;
import models.Ticket;
import models.TicketType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class CSVparser {

    public CSVparser() {
    }
    public String[] parse(String path) {
        String[] result = new String[0];
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            char[] arr = new char[100];
            char[] arr2  = new char[input.read(arr)];
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
            String res = String.valueOf(arr2);
            result = res.split(",");
            input.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return result;
    }
}
=======
import java.io.*;
public class CSVparser {
        public CSVparser() {
        }
        public String[] parse(String path) {
            String[] result = new String[0];
            try {
                FileInputStream file = new FileInputStream(path);
                InputStreamReader input = new InputStreamReader(file);
                char[] arr = new char[48];
                input.read(arr);
                String res = String.valueOf(arr);
                result = res.split(",");
                input.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return result;
        }
    }

>>>>>>> a597dc2c10769a82d9e50ade21d408d527f96dac
