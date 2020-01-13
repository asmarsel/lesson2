package edu.jcourse.lesson12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileServiceImpl implements FileService {

    @Override

    public void createFile(String fileName, ArrayList<String> dataList) {

        File file = new File("simple_file.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String data : dataList) {
                printWriter.println(data);
            }
            System.out.println("File was created");
        } catch (IOException e) {
            System.out.println("Can't save file");
        }
    }
}
