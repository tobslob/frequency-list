package com.tobslob;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            String str = readFile();
            HashMap<String, Integer> map = new HashMap<>();

            String[] splitStr = str.replaceAll("[\";,.:()]", "").replaceAll("[\n/]", " ").toLowerCase().split(" ");
            for (String s : splitStr) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }

            System.out.println(map);
        } catch (IOException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
    }

    private static String readFile() throws IOException {
        File text = new File("src/wiki.txt");

        FileInputStream fis = new FileInputStream(text);

        byte[] data = new byte[(int) text.length()];
        fis.read(data);
        fis.close();

        return new String(data, StandardCharsets.UTF_8);
    }
}
