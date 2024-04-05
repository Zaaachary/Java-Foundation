package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo08_Reader {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("Chapter11_IO/src/main/resources/file.txt", StandardCharsets.UTF_8);

        for (; ; ) {
            int n = reader.read();
            if (n == -1) {
                break;
            }
            System.out.println((char) n);
        }
        reader.close();

        try (Reader reader2 = new CharArrayReader("Hello".toCharArray())) {
            for (; ; ) {
                int n = reader2.read();
                if (n == -1) {
                    break;
                }
                System.out.println((char) n);
            }
        }

        try (Reader reader3 = new StringReader("Hello")) {
            for (; ; ) {
                int n = reader3.read();
                if (n == -1) {
                    break;
                }
                System.out.println((char) n);
            }
        }
    }


}
