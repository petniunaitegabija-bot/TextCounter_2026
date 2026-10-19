package com.example.textcounter_2026;

public class TextCounter {

    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.matches(".*[\\p{L}\\p{N}].*")) {
                count++;
            }
        }

        return count;
    }
    public int countPunctuation(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (".,?!:;„“\"'()-–—…".indexOf(c) >= 0) {
                count++;
            }
        }

        return count;
    }
}
