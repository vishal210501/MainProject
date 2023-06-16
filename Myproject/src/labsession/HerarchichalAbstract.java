package labsession;



 abstract class Mobile{
	 
	 int rate=500;
	 
	 public Mobile(int price) {
		 System.out.println("price is="+price);
	 }
	 
	 abstract void showdetails() ;
		 
	 
 }
 
 class Samsung extends Mobile{
	 
	 Samsung (){
		 super(10000);
	 }
	 
	 
	 
	 void showdetails() {
		 System.out.println("Samsung is mobile");
	 }
 }
 
 class Vivo extends Mobile{
	 Vivo(){
		 super(50000);
	 }
	 
	 void showdetails() {
		 System.out.println("vivo is vivo"+" "+ "rate="+rate);
	 }
 }

public class HerarchichalAbstract {

	public static void main(String[] args) {
		
		Mobile m= new Samsung();
		m.showdetails();
		
		Mobile m1= new Vivo();
		m1.showdetails();
		

	}

}
