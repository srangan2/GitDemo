package javacodes;

public class ReverseSentenceAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input = "I am human";
	        String reversed = reverseSentenceAndString(input);
	        System.out.println(reversed);
	    }

	    public static String reverseSentenceAndString(String input) {
	        String[] words = input.split(" "); // Split the sentence into words

	        // Reverse the order of the words and reverse each word
	        StringBuilder reversedStringBuilder = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            String word = words[i];
	            String reversedWord = reverseString(word);
	            reversedStringBuilder.append(reversedWord);
	            if (i > 0) {
	                reversedStringBuilder.append(" "); // Add space except for the last word
	            }
	        }

	        return reversedStringBuilder.toString();
	    }

	    public static String reverseString(String s) {
	        return new StringBuilder(s).reverse().toString();
	}

}
