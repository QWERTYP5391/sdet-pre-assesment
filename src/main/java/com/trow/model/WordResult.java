package com.trow.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class WordResult {

    private String word;

    private int lengthOfWord;

    public WordResult(String word) {
        this.word = word;
        this.lengthOfWord = word.length();
    }
}
