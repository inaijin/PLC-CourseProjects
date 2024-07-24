package main;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionCraftTest {
    private static final String TEST_DIRECTORY = "/Users/kourosh/Uni/PLC/CA/Phase4/FunctionCraft-Phase4/src/Tests/";

    @Test
    public void sample1() throws IOException {
        runTest("input1.txt", "output1.txt");
    }

    @Test
    public void sample2() throws IOException {
        runTest("input2.txt", "output2.txt");
    }

    @Test
    public void chopTest() throws IOException {
        runTest("input3.txt", "output3.txt");
    }

    @Test
    public void lenTest() throws IOException {
        runTest("input4.txt", "output4.txt");
    }

    @Test
    public void loopDoTest() throws IOException {
        runTest("input5.txt", "output5.txt");
    }

    @Test
    public void unaryTest() throws IOException {
        runTest("input6.txt", "output6.txt");
    }

    @Test
    public void binaryTest() throws IOException {
        runTest("input7.txt", "output7.txt");
    }

    @Test
    public void methodDefaultTest() throws IOException {
        runTest("input8.txt", "output8.txt");
    }

    @Test
    public void sample3() throws IOException {
        runTest("input9.txt", "output9.txt");
    }

    @Test
    public void sample4() throws IOException {
        runTest("input10.txt", "output10.txt");
    }

    private void runTest(String inputFile, String expectedOutputFile) throws IOException {
        String testInputFileName = TEST_DIRECTORY + "testInput.txt";
        copyFile(TEST_DIRECTORY + inputFile, testInputFileName);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        String[] functionCraftArgs = {testInputFileName};
        FunctionCraft.main(functionCraftArgs);

        System.out.flush();
        System.setOut(old);

        String capturedOutput = baos.toString();

        String expectedOutput = new String(Files.readAllBytes(Paths.get(TEST_DIRECTORY + expectedOutputFile)));

        assertEquals(expectedOutput.trim(), capturedOutput.trim());
    }

    private void copyFile(String source, String destination) throws IOException {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }
}
