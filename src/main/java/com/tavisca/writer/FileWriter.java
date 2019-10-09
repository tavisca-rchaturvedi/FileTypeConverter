package com.tavisca.writer;

import java.io.IOException;

public class FileWriter implements Writer{

    @Override
    public void writer(String content, String name)  {
        try {
            java.io.FileWriter writer = new java.io.FileWriter(name);
            System.out.println(content);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
