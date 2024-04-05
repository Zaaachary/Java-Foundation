package org.example;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo05_Filter {
    public static void main(String[] args) throws IOException {
        byte[] data = "hello world!".getBytes("UTF-8");
        try (CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))){
            int n;
            while ((n = input.read()) != -1) {
                System.out.println((char) n);
            }
            System.out.println("Total length " + input.getCount() + " bytes");
        }


    }
}

class CountInputStream extends FilterInputStream {
    // 在 InputStream 的基础上增加 count 统计字符数; in 为 FilterInputStream 的变量
    private int count;

    CountInputStream(InputStream in) {
        super(in);
    }

    public int getCount() {
        return count;
    }

    public int read() throws IOException {
        int n = in.read();
        if (n != -1) {
            count++;
        }
        return n;
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int n = in.read(b, offset, len);
        if (n!=-1) {
            this.count += n;
        }
        return n;
    }
}
