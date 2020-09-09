public class alphabet {

	public static void main(String[] args) {
		
		char alphabetArr[] = new char[26];
		char[] name = new char[100];
		String myName = new String("AGMAR-PUTRA");
		
		
		for(char c = 'A'; c <= 'Z'; ++c){
			
			alphabetArr[c - 'A'] = c;
			
		}
		
		String alphabet = new String(alphabetArr) + "#" + "-";
		
		
		for(int i = 0; i < myName.length(); i++) {
			
			name[i] = alphabet.charAt(alphabet.indexOf(myName.charAt(i)));
			System.out.print(name[i]);
			
		}
	}

}
