import java.util.Scanner;//sum of given range of numbers

class Deck{
public static void main(String oshani[]){

          Scanner s=new Scanner(System.in);

     System.out.println("Enter the range");
     System.out.println("");

	 System.out.print("Lower value :");
          int a=s.nextInt();

      System.out.println("");
	  System.out.print("Higher value :");
          int b=s.nextInt();

          int total=0;
          for(int x=a;x<=b;x++){
              total=total+x;
		  }
               System.out.println(total);

}
}