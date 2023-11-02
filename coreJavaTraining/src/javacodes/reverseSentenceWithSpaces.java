package javacodes;

public class reverseSentenceWithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String input = "I am human";
	        String reversedSentence = reverseSentenceWithSpaces(input);
	        System.out.println(reversedSentence);
	    }

	    public static String reverseSentenceWithSpaces(String input) {
	        String[] words = input.split(" "); // Split the sentence into words

	        // Reverse the order of the words and store them in a StringBuilder
	        StringBuilder reversedStringBuilder = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedStringBuilder.append(words[i]);
	            if (i > 0) {
	                reversedStringBuilder.append(" "); // Add space except for the last word
	            }
	        }

	        return reversedStringBuilder.toString();
	    }
	

	}


