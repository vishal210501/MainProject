package labsession;

public class Practice3 {
   public static void show(String s) {
	   char ch[]=s.toCharArray();
	 
	   
	   for(int i=0;i<ch.length;i++) {
		   int count=1;
		   for(int j=i+1;j<ch.length;j++) {
			   if(ch[i]==ch[j]) {
				   count++;
			   }
			   if(count>1) {
				   System.out.println(ch[i]+" "+count);
			   }
		   }
	   }
   }
	
	public static void main(String[] args) {
		String s="Success";
		System.out.println(s);
		Practice3.show(s);
	}

}
