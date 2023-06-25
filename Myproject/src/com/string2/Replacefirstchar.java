package com.string2;

public class Replacefirstchar {
	
	public static void replacechar(String str) {
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				ch[i+1]='a';
			}else if(i==0) {
				ch[i]='a';
			}
		
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String str="I Love India";
		System.out.println(str);
		
		Replacefirstchar.replacechar(str);

	}

}
