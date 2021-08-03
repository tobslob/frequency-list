package com.tobslob;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File text = new File("src/wiki.txt");
            Scanner reader = new Scanner(text);

            HashMap<String, Integer> map = new HashMap<>();
            System.out.println("Hello reader" + reader);

            while (reader.hasNextLine()) {
                String str = reader.nextLine();
                String[] splitStr = str.replaceAll("[\";,.:()]", "").replaceAll("[\n/]", " ").toLowerCase().split(" ");
                for (int i = 0; i < splitStr.length; i++) {
                    if (map.containsKey(splitStr[i])) {
                        map.put(splitStr[i], map.get(splitStr[i]) + 1);
                    } else {
                        map.put(splitStr[i], 1);
                    }
                }
            }
            reader.close();
            System.out.println(map);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
