package labsession;

import java.util.Arrays;

public class UppLowStr {

	public static void toggle(String a) {

		char ch[] = a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);

			}else if(ch[i]>='a'  &&  ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		
		}
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		String a = "JaVa Is ProGRAmming LangUAGe";
        //String a="java is programming language";
		System.out.println(a);

		UppLowStr.toggle(a);
	}

}
