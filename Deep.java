import java.util.Scanner;//importing scanner class

 class Deep{
	double a;//global variables
	double b;
		void add(){//method declare in deep class
		System.out.println(a+b);
		}
		void subs(){
		System.out.println(a-b);
		}
		void mul(){
		System.out.println(a*b);
		}
		void div(){
		System.out.println(a/b);
}
public static void main(String oshani[]){
Deep d=new Deep();//creating a new Deep object
Scanner s=new Scanner(System.in);//creating a new Scanner object, a predefined class

	System.out.print("Enter the 1st digit :");
	d.a=s.nextDouble();//user inputs

	System.out.print("Enter the 2nd digit :");
	d.b=s.nextDouble();//user inputs

	d.add();//calling the methods in Deep class
	d.subs();
	d.mul();
	d.div();

		}
	}