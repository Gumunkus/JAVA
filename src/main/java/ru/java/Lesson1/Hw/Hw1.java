package ru.java.Lesson1.Hw;

public class Hw1 {
    class Solution {
        public String reverseWords(String s) {
            List<String> words = Arrays.asList(s.trim().split("\\s+"));
            Collections.reverse(words);
            return String.join(" ", words);
        }
    }
}
