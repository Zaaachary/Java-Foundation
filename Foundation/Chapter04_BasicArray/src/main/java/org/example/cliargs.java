package org.example;

public class cliargs {
    public static void main(String[] args) {
        String version = "";
        for (String arg : args) {
            System.out.println(arg);
        }

        for (int i = 0; i < args.length; i+=2) {
            if (args[i].equals("--version")) {
                version = args[i + 1];
            }
        }
        System.out.println("version: " + version);
    }
}
