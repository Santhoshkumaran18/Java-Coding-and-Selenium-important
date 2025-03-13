package JavaImportantRevision;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String s="Santhosh";
		String input=s.toLowerCase();
		int vowel=0,consonants=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a' ||input.charAt(i)=='e' || input.charAt(i)=='i' ||input.charAt(i)=='o' || 
				input.charAt(i)=='u') {
				vowel++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowels count: " + vowel);
		System.out.println("Consonants count: " + consonants);
		System.out.println(input.charAt(vowel));
	}
}
