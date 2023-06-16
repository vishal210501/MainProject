package com.nestedforLoop;

public class Table1to5 {

	public static void main(String[] args) {
		
		
//		for(int i=1;i<=5;++i) {
//			for(int j=1; j<=10; ++j) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
               
		
		int count=0;
		int table=0;
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=10; j++) {
				table=i*j;
				System.out.println(i+"*"+j+"="+table);
			}
			System.out.println();
		}
	}

}
