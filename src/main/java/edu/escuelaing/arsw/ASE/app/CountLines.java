package edu.escuelaing.arsw.ASE.app;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: java CountLines <parameter> <filename/directory>");
            System.exit(1);
        }

        String parameter = args[0];
        String path = args[1];

        File fileOrDirectory = new File(path);
        if (!fileOrDirectory.exists()) {
            System.err.println("File or directory not found: " + path);
            System.exit(1);
        }

        List<File> files = new ArrayList<>();
        if (fileOrDirectory.isFile()) {
            files.add(fileOrDirectory);
        } else {
            findFiles(fileOrDirectory, files);
        }

        for (File file : files) {
            switch (parameter) {
                case "phy":
                    CountLinesPhy.countPhysicalLines(file);
                    break;
                case "loc":
                    CountLinesLoc.countLinesOfCode(file);
                    break;
                default:
                    System.err.println("Invalid parameter: " + parameter);
                    System.exit(1);
            }
        }
    }

    private static void findFiles(File directory, List<File> files) {
        File[] directoryFiles = directory.listFiles();
        if (directoryFiles != null) {
            for (File file : directoryFiles) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    findFiles(file, files); // Recursively find files in subdirectories
                }
            }
        }
    }
}

