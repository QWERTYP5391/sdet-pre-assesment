## Requirements
1. Write a method or function in the major programming language of your choice that returns the longest word in a sentence and its length. For example, “The cow jumped over the moon.” should return “jumped” and 6
2. Write unit tests, reworking code as needed
3. Add a method that returns the shortest word and length with unit tests

##Assumptions
Here are some assumptions I have made in order to create the method:

1. Null or Empty inputs will throw an IllegalArgumentException.java
2. If there are multiple words with the same length for shortest and longest words return the word that occurs first in te sentence
3. Retuning to the client that calls my method WordResult {String word; int lengthOfWord;} (Just returning a String was another viable result to return)
4. Punctuation are the values that can separate words from each other but I did give flexibility to define a custom punctuation
5. Input for the methods can be a String or an array of Strings

##Build and execute tests
If you have Maven installed you can run tests with mvn clean test or you can run tests in com.utility.WordUtilityTest using JUnit4



