package com.utility;

import com.model.WordResult;

public class WordUtility {

    public static String defaultPunctuation = "[^A-Za-z]";

    private WordUtility() {
        //This is a utility class
    }

    /**
     * This method finds the longest word in a sentence.
     *
     * @param sentence The input sentence
     * @return The longest word result
     */
    public static WordResult findLongestWord(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            throw new IllegalArgumentException("Sentence cannot be null or empty");
        }
        String[] words = sentence.split(defaultPunctuation);
        String longestWord = getLongestWord(words);
        return new WordResult(longestWord);
    }

    /**
     * This method finds the longest word in a sentence with custom punctuation.
     *
     * @param sentence    The input sentence
     * @param punctuation The custom punctuation
     * @return The longest word result
     */
    public static WordResult findLongestWord(String sentence, String punctuation) {
        if (sentence == null || sentence.length() == 0) {
            throw new IllegalArgumentException("Sentence cannot be null or empty");
        }
        if (punctuation == null) {
            throw new IllegalArgumentException("Punctuation cannot be null");
        }
        String[] words = sentence.split(punctuation);
        String longestWord = getLongestWord(words);
        return new WordResult(longestWord);
    }

    /**
     * This method finds the longest word in a sentence.
     *
     * @param sentence The input sentence
     * @return The longest word
     */
    public static WordResult findLongestWord(String[] sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence cannot be null");
        }
        return new WordResult(getLongestWord(sentence));
    }

    /**
     * This method finds the shortest word in a sentence.
     *
     * @param sentence The input sentence
     * @return The longest word result
     */
    public static WordResult findShortestWord(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        String[] words = sentence.split(defaultPunctuation);
        String shortestWord = getShortestWord(words);
        return new WordResult(shortestWord);
    }

    /**
     * This method finds the shortest word in a sentence.
     *
     * @param sentence    The input sentence
     * @param punctuation the custom punctuation
     * @return The shortest word result
     */
    public static WordResult findShortestWord(String sentence, String punctuation) {
        if (sentence == null || sentence.length() == 0) {
            throw new IllegalArgumentException("Sentence cannot be null or empty");
        }
        if (punctuation == null) {
            throw new IllegalArgumentException("Punctuation cannot be null");
        }
        String[] words = sentence.split(punctuation);
        String shortestWord = getShortestWord(words);
        return new WordResult(shortestWord);
    }

    /**
     * This method finds the shortest word in a sentence.
     *
     * @param sentence The input sentence
     * @return The shortest word result
     */
    public static WordResult findShortestWord(String[] sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence cannot be null");
        }
        return new WordResult(getShortestWord(sentence));
    }

    /**
     * @param words The array of words
     * @return String longest word
     */
    private static String getLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    /**
     * @param words The array of words
     * @return String shortest word
     */
    private static String getShortestWord(String[] words) {
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty() && word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }
}
