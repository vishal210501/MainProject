package com.test_p;

public class MaxMin {

	public static void show(int a[]) {

		int maxnum=a[0];
		int minnum=a[0];
		for (int i = 0; i < a.length; i++) {
			if(maxnum<a[i]) {
				maxnum=a[i];
				
			}else if(minnum>a[i]) {
				minnum=a[i];
			}
		}
             System.out.println("max :"+maxnum+" "+"min :"+minnum);    
	}

	public static void main(String[] args) {

		int a[] = { 4, 7, 8, 2, 1, 9 };
		MaxMin.show(a);

	}

}
