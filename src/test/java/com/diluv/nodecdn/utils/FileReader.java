package com.diluv.nodecdn.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static String readFile(String file) {

        try {
            return new String(Files.readAllBytes(Paths.get(FileReader.class.getClassLoader().getResource(file).toURI())));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
