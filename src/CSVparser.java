
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
<<<<<<< HEAD
=======


>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
public class CSVparser {

    public CSVparser() {
    }
    public String[] parse(String path) {
        String[] result = new String[0];
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            char[] arr = new char[200];
            char[] arr2  = new char[input.read(arr)];
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
            String res = String.valueOf(arr2);
            result = res.split("\r\n");
            input.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return result;
    }
}
<<<<<<< HEAD
=======

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
