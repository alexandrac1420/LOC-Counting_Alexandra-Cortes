package edu.escuelaing.arsw.ASE.app;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountLinesPhy {
    public static void countPhysicalLines(File file) {
        try {
            FileReader fr = new FileReader(file);
            LineNumberReader lnr = new LineNumberReader(fr);
            lnr.skip(Long.MAX_VALUE);
            System.out.println("File: " + file.getName() + ", Physical lines: " + (lnr.getLineNumber() + 1));
            lnr.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

