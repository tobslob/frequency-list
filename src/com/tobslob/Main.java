package com.tobslob;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File text = new File("src/wiki.txt");

            FileInputStream fis = new FileInputStream(text);

            byte[] data = new byte[(int) text.length()];

            HashMap<String, Integer> map = new HashMap<>();

            while(fis.read(data) != -1) {
                String str = new String(data, StandardCharsets.UTF_8);
                String[] splitStr = str.replaceAll("[\";,.:()]", "").replaceAll("[\n/]", " ").toLowerCase().split(" ");
                for (String s : splitStr) {
                    if (map.containsKey(s)) {
                        map.put(s, map.get(s) + 1);
                    } else {
                        map.put(s, 1);
                    }
                }
                System.out.println(map);
            }

            fis.close();
        } catch (IOException io){
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
    }
}
