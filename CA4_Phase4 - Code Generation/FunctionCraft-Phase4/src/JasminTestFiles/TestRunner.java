package JasminTestFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestRunner {

    private static final String WORKING_DIRECTORY = "/Users/kourosh/Uni/PLC/CA/Phase4/FunctionCraft-Phase4/src/JasminTestFiles";

    public void runTest(String input) {
        try {
            Path source = Paths.get("/Users/kourosh/Uni/PLC/CA/Phase4/FunctionCraft-Phase4/codeGenOutput/Main.j");
            Path destination = Paths.get(WORKING_DIRECTORY + "/Main.j");
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");

            ProcessBuilder processBuilder;
            if (input.equalsIgnoreCase("Test")) {
                processBuilder = new ProcessBuilder("java", "-jar", "jasmin.jar", "Main.j");
                processBuilder.directory(new File(WORKING_DIRECTORY));
                executeCommand(processBuilder, "TestOutput.txt");
                processBuilder = new ProcessBuilder("java", "Main");
                processBuilder.directory(new File(WORKING_DIRECTORY));
                executeCommand(processBuilder, "TestOutput.txt");
            } else if (input.equalsIgnoreCase("Give")) {
                processBuilder = new ProcessBuilder("javac", "-g", "Main.java");
                processBuilder.directory(new File(WORKING_DIRECTORY));
                executeCommand(processBuilder, "AnswerJasmin.txt");
                processBuilder = new ProcessBuilder("java", "-jar", "classFileAnalyzer.jar", "Main.class");
                processBuilder.directory(new File(WORKING_DIRECTORY));
                executeCommand(processBuilder, "AnswerJasmin.txt");
            } else {
                System.out.println("Invalid input.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void executeCommand(ProcessBuilder processBuilder, String outputFileName) throws IOException, InterruptedException {
        Process process = processBuilder.start();
        try (BufferedReader stdOutput = new BufferedReader(new InputStreamReader(process.getInputStream()));
             BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(WORKING_DIRECTORY + "/" + outputFileName, true))) {

            String line;
            writer.write("Standard Output:\n");
            while ((line = stdOutput.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.write("Standard Error:\n");
            while ((line = stdError.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
        process.waitFor();
    }
}
