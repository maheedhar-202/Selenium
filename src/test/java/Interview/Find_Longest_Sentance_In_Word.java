package Interview;

public class Find_Longest_Sentance_In_Word {
        // Method to find the longest word in a sentence
        public static String findLongestWord(String sentence) {
                // TODO
        	
        	if(sentence == null|| sentence.isEmpty()) {
        		return "";
        	}
        	String[] Word = sentence.split(" \\s+");
        	String longest="";
        	for(String Words:Word) {
        		if(Words.length()>longest.length()) {
        			longest=Words;
        		}
        	}
        	
        	
                return longest;
        }

        // Method to run all test cases
        public static void runTests() {
                assert testLongestWord("The quick brown fox", "quick") : "Test case 1 failed";
                assert testLongestWord("Jumped over the lazy dog", "Jumped") : "Test case 2 failed";
                assert testLongestWord("", "") : "Test case 3 failed";
                assert testLongestWord("A long word: Supercalifragilisticexpialidocious",
                                "Supercalifragilisticexpialidocious") : "Test case 4 failed";
                assert testLongestWord("Hello World", "Hello") : "Test case 5 failed";

                System.out.println("All test cases passed!");
        }

        // Helper method to validate the result of findLongestWord
        private static boolean testLongestWord(String sentence, String obj) {

                return findLongestWord(sentence).equals(obj);
        }

        public static void main(String[] args) {
                runTests();
        }

}
