package com.exceptionHandle;

public class Nested {

	public static void main(String[] args) {
		int count = 0;

		try {
			try {
				count++;
				try {
					count++;
					try {
						count++;
						throw new Exception();
					} catch (Exception e) {
						count++;
						throw e;
					}
				} catch (Exception e) {
					count++;
					throw e;
				}
			} catch (Exception e) {
				count++;
				throw e;

			}
		} catch (Exception e) {
			System.out.println(count);// 6
		}

	}

}
