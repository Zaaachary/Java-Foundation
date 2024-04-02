package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo02_FileDirectory {
    public static void main(String[] args) throws IOException {
        // 打印工作目录
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);

        // 对标 python path.join();
        Path path = Paths.get(workingDir, "Chapter11_IO", "src", "main", "java");
        System.out.println(path);

        // 直接转文件
        File file = path.toFile();
        System.out.println("是文件：" + file.isFile());
        System.out.println("是目录：" + file.isDirectory());

        // 拼接路径
        Path base = Paths.get("my", "base", "path");
        Path resolvedPath = base.resolve("file.txt");
        System.out.println("合并后的路径: " + resolvedPath.toString());
    }
}
