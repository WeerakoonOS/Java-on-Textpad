import java.util.Scanner;
                            //assignment 3 using for loop
class Book{
     double add(double m,double n){
	       System.out.println("Answer = "+(m+n));
	       double answer=(m+n);
	       return answer;
 }
     double subs(double m,double n){
	       System.out.println("Answer = "+(n-m));
	        double answer=(m-n);
	       return answer;
 }
     double mul(double m,double n){
	       System.out.println("Answer = "+(m*n));
	        double answer=m*n;
	       return answer;

 }
	 double div(double m,double n){
	       System.out.println("Answer = "+(m/n));
	        double answer=m/n;
	       return answer;

 }

public static void main (String oshani[]){

	        Book b=new Book();
            Scanner s=new Scanner(System.in);

          System.out.println("Welcome to the Calculator! Type 'exit' to quit");
		  System.out.print("Enter the number : ");
           double answer=s.nextDouble();

         for(int i=0;i<=3;i++){

			       System.out.print("Operator : ");
                         String op=s.next();
			 if (op.equals("+")){
				System.out.print("Enter the number : ");
				double d=s.nextDouble();

				answer=b.add(answer,d);
			}else if(op.equals("-")){
				System.out.print("Enter the number : ");
				double d=s.nextDouble();

			    answer=b.subs(answer,d);
			}else if(op.equals("*")){
				System.out.print("Enter the number : ");
				double d=s.nextDouble();

			    answer=b.mul(answer,d);
			}else if(op.equals("/")){
				System.out.print("Enter the number : ");
				double d=s.nextDouble();

			    answer=b.div(answer,d);
			}
                   System.out.print("Exit(Y/N) :");
                       String ex=s.next();

            if(ex.equalsIgnoreCase("y")){
				break;
			}else{
                continue;
			 }
	   }
}
}