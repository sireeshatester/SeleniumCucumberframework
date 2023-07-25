package SeleniumFramework.SelemiumJavaFramework;

public class Round1 {
	public static int noof=0;
	public char[] expected= {'a','e','i','o','u'};
	static String vowWord="";
	
	public String vowWord(String S) {
		for(int i=0;i<S.length();i++) {
			for(char temp:expected) {
				if(temp==S.charAt(i)) {
					vowWord=vowWord+temp;
				}
			}
		}
		return vowWord;
	}
	
	
	public static void main(String[] args) {
		Round1 sol=new Round1();
		String S="njimkjauieioua";
		vowWord=sol.vowWord(S);
		System.out.println("vowles word is: "+vowWord);
		
	}
	
	

}
