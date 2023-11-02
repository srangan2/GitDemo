package javacodes;

public class ReverseStringwithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "i am human";
        String reversedString = reverseStringWithSpaces(input);
        System.out.println(reversedString);
    }

    public static String reverseStringWithSpaces(String input) {
        String[] words = input.split(" "); // Split the string into words

        // Reverse each word and store them in a StringBuilder
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            reversedStringBuilder.append(wordBuilder.reverse()).append(" ");
        }

        // Remove the extra space at the end and convert to a string
        return reversedStringBuilder.toString().trim();
		
}
}