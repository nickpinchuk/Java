package hw_8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileLogger extends FileLoggerConfiguration {
    public static void main(String[] args) {
        debug("Testwerwer");
        info("Test 2werwer");
    }

    public static void debug(String line) {
        try (FileWriter writer = new FileWriter(filePath, true);
             BufferedWriter BufferedWriter = new BufferedWriter(writer)) {
            BufferedWriter.write("[" + dat + "]" + "[" + LoggingLevel.INFO + "][" + LoggingLevel.DEBUG + "] Message: " + line + " \n");
            System.out.println(LoggingLevel.DEBUG + " Successfully written");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void info(String line) {
        try (FileWriter writer = new FileWriter(filePath, true);
             BufferedWriter BufferedWriter = new BufferedWriter(writer)) {
            BufferedWriter.write("[" + dat + "]" + "[" + LoggingLevel.INFO + "] Message: " + line + " \n");
            System.out.println(LoggingLevel.INFO + " Successfully written");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
