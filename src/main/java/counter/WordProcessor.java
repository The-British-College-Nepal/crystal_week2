
package counter;

/**
 * WordProcessor implementation of the Counter interface.
 */
public class WordProcessor implements Counter {

    // STEP 3.1: Private text attribute
    private String text = "";

    // STEP 3.2: Getter
    public String getText() {
        return this.text;
    }

    // STEP 3.2: Setter
    public void setText(String text) {
        this.text = text;
    }

    // STEP 2.1 and STEP 3.3: Count words
    @Override
    public int countWords(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }

    // STEP 2.2 and STEP 3.3: Count letters
    @Override
    public int countLetters(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        int letters = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
        }

        return letters;
    }

    // STEP 2.3 and STEP 3.3: Get length
    @Override
    public int getLength(String sentence) {

        if (sentence == null) {
            sentence = this.text;
        }

        return sentence.length();
    }
}
