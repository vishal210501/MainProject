package com.string2;

public class DuplicateString2 {

	public static void duplicate(String str) {

		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (ch[k] == ch[i]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
					}
				}
			//if (count > 1) { // for duplicate 
				//System.out.println(ch[i] + "" + count);
//				}else if(count==1) {// for unique
//					System.out.println(ch[i]);
//				}
				System.out.println(ch[i]+" "+count);//for frequency 
			}
			}
		}
		

	

	public static void main(String[] args) {
		String str = "missipsi";
		System.out.println(str);
		DuplicateString2.duplicate(str);

	}

}
