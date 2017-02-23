import java.util.Scanner;
class Keep{
   void m(){
   System.out.print("m method");
   }

public static void main(String oshani[]){
           Keep p=new Keep();
           Scanner s=new Scanner(System.in);
           System.out.print("Enter the number :");
           int x=s.nextInt();
           final int y=5;//making y a constant

 switch (x){
         case 1:System.out.println("case 1");break;//executes only this line
         case 2:System.out.println("case 2");break;
         case 3:System.out.println("case 3");break;

         default: System.out.println("case default");//will execute if 4,5,..... is entered

        // case 10:p.m();
        // System.out.println(" ");
         //case y: System.out.println("Case y");//y has made to be a constant
}
}

}

