import java.util.Scanner;

class Put{

public static void main(String oshani[]){
     Scanner s=new Scanner(System.in);

     int marks=s.nextInt();

if (marks>=75){
	System.out.println("A Pass");}
else if (marks>=65){
	System.out.println("B Pass");}
else if (marks>=55){
	System.out.println("C Pass");}
else{System.out.println("Fail");}


}
}