package com.string2;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		String a[] = {"i", "am","very","smart"};
		
		
		String space=" ";
		int iCnt = 0;
		for(int i=0;i<a.length;i++) {
			iCnt++;
		if(iCnt==3) {
			a[i]=a[i]+" ";
		}
		System.out.println(a[i]);
	}
	}
}


