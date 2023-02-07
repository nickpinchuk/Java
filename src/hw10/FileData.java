package hw10;

import java.io.File;

public class FileData {
    static File dir1 = new File("src/", "Main.java");
    static String name = dir1.getName();
    static String path = "src/";
    static String path1 = "src/hw10/";
    int length = (byte) dir1.length();


}
