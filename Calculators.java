import java.util.Scanner;

class Calculators{
      void add(double x, double y){
	  System.out.println("The Addition = "+(x+y));
		  }
      void subs(double x, double y){
	  System.out.println("The Substraction = "+(x-y));
		  }
      void mul(double x, double y){
	  System.out.println("The Multiplication = "+x*y);
		  }
      void div(double x, double y){
	  System.out.println("The Division = "+x/y);
		  }
		public static void main(String oshani[]){

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the 1st digit : ");
		double x=s.nextDouble();

		System.out.print("Enter the 2nd digit : ");
		double y=s.nextDouble();

		Calculators c=new Calculators();
		c.add(x,y);
		c.subs(x,y);
		c.mul(x,y);
		c.div(x,y);

}
}