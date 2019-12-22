package org.utility;

import com.trow.model.WordResult;
import com.trow.utility.WordUtility;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class WordUtilityTest {

    private static final String TEST_SENTENCE = "The cow jumped over the moon";
    private static final String TEST_SENTENCE_WITH_SPECIAL_CHARACTERS = "The@ cow# jumped% over^ the moon&...*(";

    @Test
    public void positive_FindLongestWord() {
        WordResult expected = new WordResult("jumped");

        WordResult result = WordUtility.findLongestWord(TEST_SENTENCE);
        assertThat(result.getWord(), equalTo(expected.getWord()));
        assertThat(result.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result1 = WordUtility.findLongestWord(TEST_SENTENCE, WordUtility.WORD_DIVIDER);
        assertThat(result1.getWord(), equalTo(expected.getWord()));
        assertThat(result1.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result2 = WordUtility.findLongestWord(TEST_SENTENCE.split(WordUtility.WORD_DIVIDER));
        assertThat(result2.getWord(), equalTo(expected.getWord()));
        assertThat(result2.getLengthOfWord(), equalTo(expected.getLengthOfWord()));
    }

    @Test
    public void positive_FindLongestWordWithSpecialCharacters() {
        WordResult expected = new WordResult("jumped");

        WordResult result = WordUtility.findLongestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS);
        assertThat(result.getWord(), equalTo(expected.getWord()));
        assertThat(result.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result1 = WordUtility.findLongestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS, WordUtility.WORD_DIVIDER);
        assertThat(result1.getWord(), equalTo(expected.getWord()));
        assertThat(result1.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result2 = WordUtility.findLongestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS.split(WordUtility.WORD_DIVIDER));
        assertThat(result2.getWord(), equalTo(expected.getWord()));
        assertThat(result2.getLengthOfWord(), equalTo(expected.getLengthOfWord()));
    }


    @Test
    public void positive_ShortestWord() {
        WordResult expected = new WordResult("The");

        WordResult result = WordUtility.findShortestWord(TEST_SENTENCE);
        assertThat(result.getWord(), equalTo(expected.getWord()));
        assertThat(result.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result1 = WordUtility.findShortestWord(TEST_SENTENCE, WordUtility.WORD_DIVIDER);
        assertThat(result1.getWord(), equalTo(expected.getWord()));
        assertThat(result1.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result2 = WordUtility.findShortestWord(TEST_SENTENCE.split(WordUtility.WORD_DIVIDER));
        assertThat(result2.getWord(), equalTo(expected.getWord()));
        assertThat(result2.getLengthOfWord(), equalTo(expected.getLengthOfWord()));
    }

    @Test
    public void positive_ShortestWordWithSpecialCharacters() {
        WordResult expected = new WordResult("The");

        WordResult result = WordUtility.findShortestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS);
        assertThat(result.getWord(), equalTo(expected.getWord()));
        assertThat(result.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result1 = WordUtility.findShortestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS, WordUtility.WORD_DIVIDER);
        assertThat(result1.getWord(), equalTo(expected.getWord()));
        assertThat(result1.getLengthOfWord(), equalTo(expected.getLengthOfWord()));

        WordResult result2 = WordUtility.findShortestWord(TEST_SENTENCE_WITH_SPECIAL_CHARACTERS.split(WordUtility.WORD_DIVIDER));
        assertThat(result2.getWord(), equalTo(expected.getWord()));
        assertThat(result2.getLengthOfWord(), equalTo(expected.getLengthOfWord()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindLongestWordWithNullSentence() {
        WordUtility.findLongestWord((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindLongestWordWithNullSentenceArray() {
        WordUtility.findLongestWord((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindLongestWordWithEmptySentence() {
        WordUtility.findLongestWord("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindLongestWordWithNullSentenceAndValidWordDivider() {
        WordUtility.findLongestWord(null, WordUtility.WORD_DIVIDER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindLongestWordWithValidSentenceAndNullWordDivider() {
        WordUtility.findLongestWord(TEST_SENTENCE, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindShortestWordWithNullSentence() {
        WordUtility.findShortestWord((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindShortestWordWithNullSentenceArray() {
        WordUtility.findShortestWord((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindShortestWordWithEmptySentence() {
        WordUtility.findShortestWord("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindShortestWordWithNullSentenceAndValidWordDivider() {
        WordUtility.findShortestWord(null, WordUtility.WORD_DIVIDER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_FindShortestWordWithValidSentenceAndNullWordDivider() {
        WordUtility.findShortestWord(TEST_SENTENCE, null);
    }

}