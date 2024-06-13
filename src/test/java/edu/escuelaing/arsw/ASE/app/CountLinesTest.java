package edu.escuelaing.arsw.ASE.app;
import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import edu.escuelaing.arsw.ASE.app.Resources.*;


public class CountLinesTest extends TestCase {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    protected void setUp() throws IOException {
        System.setOut(new PrintStream(outContent));
    }

    protected void tearDown() {
        System.setOut(originalOut);
    }

    public void testCountLines_phy() throws IOException {
        String[] args = {"phy", "src/test/java/edu/escuelaing/arsw/ASE/app/Resources/ExampleFile.java"}; // Cambia por la ruta de un archivo existente
        CountLines.main(args);
        assertTrue(outContent.toString().contains("File: ExampleFile.java, Physical lines: 9"));
    }
    public void testCountLines_loc() throws IOException {
        String[] args = {"loc", "src/test/java/edu/escuelaing/arsw/ASE/app/Resources/ExampleFile.java"}; // Cambia por la ruta de un archivo existente
        CountLines.main(args);
        assertTrue(outContent.toString().contains("File: ExampleFile.java, Lines of code: 6"));
    }
    
    public void testCountLinesDirectory_phy() throws IOException {
        String[] args = {"phy", "src/test/java/edu/escuelaing/arsw/ASE/app/Resources"}; // Cambia por la ruta de un archivo existente
        CountLines.main(args);
        assertTrue(outContent.toString().contains("File: ExampleFile.java, Physical lines: 9"));
        assertTrue(outContent.toString().contains("File: ExampleFile1.java, Physical lines: 14"));
    }

    public void testCountLinesDirectory_loc() throws IOException {
        String[] args = {"loc", "src/test/java/edu/escuelaing/arsw/ASE/app/Resources"}; // Cambia por la ruta de un archivo existente
        CountLines.main(args);
        assertTrue(outContent.toString().contains("File: ExampleFile.java, Lines of code: 6"));
        assertTrue(outContent.toString().contains("File: ExampleFile1.java, Lines of code: 6"));
    }

}

