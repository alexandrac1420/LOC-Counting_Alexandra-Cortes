package edu.escuelaing.arsw.ASE.app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesLoc {
    public static void countLinesOfCode(File file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int loc = countLinesOfCode(br);
            br.close();
            System.out.println("File: " + file.getName() + ", Lines of code: " + loc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countLinesOfCode(BufferedReader br) throws IOException {
        int loc = 0;
        boolean inBlockComment = false;
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();

            // Block comments
            if (line.startsWith("/*") && !line.endsWith("*/")) {
                inBlockComment = true;
            }
            if (inBlockComment) {
                if (line.endsWith("*/")) {
                    inBlockComment = false;
                }
                continue;
            }

            // Blank lines
            if (line.isEmpty() || line.startsWith("//")) {
                continue;
            }

            // Block comment
            if (line.startsWith("/*") && line.endsWith("*/")) {
                continue;
            }

            loc++;
        }
        return loc;
    }
}
