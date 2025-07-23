package src;
public class TextProcessor {
    // Count words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence and count words
        if(sentence == null){
            return 0;
        }else{
            int countWords = sentence.split("\\s").length;
            return countWords;
        }

    }
    // Replace specific words
    public static String replaceWord(String text, String oldWord, String
            newWord) {
        // Replace all occurrences of oldWord with newWord
        String result = text.replace(oldWord, newWord);
        return result;

    }
    public static void main(String[] args) {
        // Count words
        String sentence =  "Java is fun and Java is powerful";
        System.out.println("Number of words: " + countWords(sentence));

        // Replace "Java" with "Programming"
        String oldWord = "Java";
        String newWord = "Programming";
        System.out.println(replaceWord(sentence,oldWord,newWord));
    }
}