package com.excp_asst;
//4. WAP to show checked exception and use multiple catch block with universal Exception handler
public class Q4 {
	
	public void zmr() {
		//throw new IOException ("msg");
	}
	public void r15() throws Exception {
		zmr();
	}

	public static void main(String[] args) {
		
		Q4 q= new Q4();
		try {
			q.r15();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//catch (Exception e1) {
			//e1.printStackTrace();
		}
	

	}

//}
