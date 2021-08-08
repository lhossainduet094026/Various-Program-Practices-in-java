public class App {

	public static void main(String[] args) {
		String word = "abc";
		String subSequence = getSubSequence(word);
		System.out.println(subSequence);

	}

	private static String getSubSequence(String word) {

		if (word.isEmpty()) {
			return "";
		}
		char first = word.charAt(0);
		System.out.println(first);
		String rest = getSubSequence(word.substring(1));

		String result = "";
		for (String subSeq : rest.split(",", -1)) {
			result += "," + first + subSeq;
			result += "," + subSeq;
		}
		return result.substring(1);
	}

}