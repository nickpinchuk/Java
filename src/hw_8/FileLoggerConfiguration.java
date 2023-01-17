package hw_8;

import java.util.Date;

public class FileLoggerConfiguration extends Throwable{
    static String filePath = "src/hw_8/output.txt";
    static String fileName = "output.txt";
    static long limit = 50;
    static Date date = new Date();
    static  String format = "txt";
    static String dat = date.toString();

    static enum LoggingLevel {
        INFO,
        DEBUG
    }

}
