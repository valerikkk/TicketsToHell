import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVparser {

    public CSVparser() {
    }
    public ArrayList<String> parse(String path) {
        ArrayList<String> result = new ArrayList<>();
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