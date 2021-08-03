package com.tobslob;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "Wikimedia Foundation Software Engineer Programming Task\n"
                + "\n"
                + "Your task is to provide a frequency list of the words in this\n"
                + "document, along with the code you've written to generate the list. Do\n"
                + "not use anything beyond the standard libraries in your language of\n"
                + "choice. You should be able to articulate your definition of a \"word\"\n"
                + "and why it is appropriate to the task. You can use whatever\n"
                + "programming language you like, as long as it isn’t overly obscure… and\n"
                + "it isn't COBOL. :)\n"
                + "\n"
                + "Please do not leave any comments here on GitHub. Submit your code and\n"
                + "your results as instructed by the recruiter. If you have technical\n"
                + "difficulties with your submission, contact your recruiter.\n"
                + "\n"
                + "The purpose of the frequency list is to gain some insight into what\n"
                + "words are most common in English, even though this document isn't\n"
                + "really a sufficiently large sample to do so. Your program could be run\n"
                + "on a larger text, so it should be sufficiently efficient that it could\n"
                + "run on a one- to two-million-word corpus without too much trouble. You\n"
                + "might also find it amusing to run the program on a plain text version\n"
                + "of your resumé to see what bubbles to the top.\n"
                + "\n"
                + "In order to give you more text to work on, this paragraph is about\n"
                + "some WikiThings. “Wiki” is a Hawaiʻian word that means “quick”; a wiki\n"
                + "is a type of website with editable content. Wikipedia is the global,\n"
                + "free, multilingual internet encyclopedia. MediaWiki is a particular\n"
                + "wiki engine developed for and used by Wikipedia and the other\n"
                + "Wikimedia projects; it is free/libre open-source software. Wikimedia\n"
                + "is the collective name for the Wikimedia movement, revolving around a\n"
                + "group of inter-related wiki projects, including Wikipedia, Wiktionary,\n"
                + "and others. The Wikimedia Foundation (WMF) is a non-profit\n"
                + "organization—headquartered in San Francisco, U.S.A.—that runs the\n"
                + "Wikimedia projects.";


        String[] splitStr = str.replaceAll("[\";,.:()]", "").replaceAll("[\n/]", " ").toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < splitStr.length; i++) {
            if (map.containsKey(splitStr[i])) {
                map.put(splitStr[i], map.get(splitStr[i]) + 1);
            } else {
                map.put(splitStr[i], 1);
            }
        }
        System.out.println(map);
    }
}
