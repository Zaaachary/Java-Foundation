package org.example;

import java.io.*;

public class CopyFile {
    // java org/example/CopyFile.java -i ../resources/file.txt -o ../resources/file.cp2.txt
    public static void main(String[] args) throws IOException{
        // -i input_path -o output_path
        String inputPath = "";
        String outputPath = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-i")) {
                inputPath = args[i + 1];
            } else if (args[i].equals("-o")) {
                outputPath = args[i + 1];
            }
        }
        System.out.println(String.format("inputPath: %s\noutputPath: %s", inputPath, outputPath));

        InputStream input = new FileInputStream(inputPath);
        OutputStream output = new FileOutputStream(outputPath);
        byte[] buffer = new byte[1024];
        for (;;) {
            int len = input.read(buffer);
            if (len == -1) {
                break;
            }
            output.write(buffer, 0, len);
            output.flush();
        }
        int len;

    }
}
