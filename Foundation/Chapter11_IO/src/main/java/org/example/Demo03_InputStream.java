package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Demo03_InputStream {
    public static void main(String[] args) throws IOException{
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);
        Path path = Paths.get(cwd, "Chapter11_IO", "src", "main", "resources", "file.txt");

//        InputStream input = new FileInputStream(path.toFile());
//        InputStream input = new FileInputStream(path.toString());
//        InputStream input = Files.newInputStream(path);   // 不支持 mark 和 reset
        InputStream input = new BufferedInputStream(Files.newInputStream(path));    // 支持 mark 和 reset

        if (input.markSupported())
            input.mark(0);
        else System.out.println("mark not supported");

        int n;
        StringBuilder sb = new StringBuilder();
        while((n = input.read()) != -1){
            System.out.println("read byte: " + n + "; parsed: " + (char) n);
            sb.append((char)n);
        }
        System.out.println("sb:" + sb);

        if (input.markSupported()) {
            System.out.println("\nReset to file 0");
            input.reset();
            byte[] buffer = new byte[100];
            while ((n = input.read(buffer)) != -1) {
                System.out.print("read " + n + " bytes");
                System.out.println("; parsed String offset + length: \n" + new String(buffer, 0, n));
                System.out.println("; parsed String: \n" + new String(buffer)); // will output 100 NULL byte
            }
        }
        input.close();

        // 模拟字节输入流
        byte[] data = { 72, 101, 108, 108, 111, 33 };   // Hello!
        try (InputStream input2 = new ByteArrayInputStream(data)) {
            while ((n = input2.read()) != -1) {
                System.out.println((char)n);
            }
        }
    }
}
