
package counter;

/**
 * Defines the operations for analysing a sentence.
 * Classes implementing this interface must provide
 * methods to count words, count letters and get length.
 */
public interface Counter {

    /**
     * Counts the number of words in a sentence.
     *
     * @param sentence the sentence to analyse
     * @return the total number of words
     */
    int countWords(String sentence);

    /**
     * Counts the total number of alphabetic letters in a sentence.
     *
     * @param sentence the sentence to analyse
     * @return the total number of letters
     */
    int countLetters(String sentence);

    /**
     * Gets the total character length of a sentence,
     * including spaces.
     *
     * @param sentence the sentence to analyse
     * @return the total length of the sentence
     */
    int getLength(String sentence);
}
