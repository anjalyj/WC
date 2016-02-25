/**
 * Created by anjalyj on 25/02/16.
 */

import java.io.*;

public class Reader {
    private String fileName;

    Reader(String fileName) {
        this.fileName = fileName;
    }

    public String readContent() {
        String content = "";
        try {
            File file = new File(fileName);
            int size = (int) file.length();
            FileReader fr = new FileReader(file);
            char[] buffer = new char[size];
            fr.read(buffer, 0, size);
            content = String.valueOf(buffer);
        }
        catch (Exception e) {
            System.out.println("WC :" + fileName + ":No Such File Or Directory");
        }
        return content;
    }
}
