package com.tobslob;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File text = new File("src/wiki.txt");

            FileInputStream fis = new FileInputStream(text);

            byte[] data = new byte[(int) text.length()];
            fis.read(data);
            fis.close();

            String str = new String(data, "UTF-8");

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
        } catch (IOException io){
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
    }
}
