package org.example;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo04_OutputStream {
    public static void main(String[] args) {
        Path path = Paths.get("Chapter11_IO","src","main","resources","file2.txt");
        try {
            writeFile(path.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String path) throws IOException {
        OutputStream output = new FileOutputStream(path);
        output.write(72); // H
        output.write(101); // e
        output.write(108); // l
        output.write(108); // l
        output.write(111); // o
        output.close();

        // append = true; 类似 python 的 with open(path, 'a') as output:
        try(OutputStream output2 = new FileOutputStream(path, true)){
            output2.write("\nWorld".getBytes("UTF-8"));
        }
    }
}
