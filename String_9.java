package string_stringBuffer;

public class String_9 {

	public static void main(String[] args) {
		String str = "ab****cd";
		String s1 = "";
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == '*') {
				ch[i] = '\0';
				ch[i-1] = '\0';
				if(ch[i+1] != '*') {
					ch[i+1] = '\0';
				}
			}
		}
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] != '\0') {
			s1+=ch[i];
			}
		}
		System.out.println(s1);
		
	}

}
