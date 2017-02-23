class Kept{

public static void main(String oshani[]){
      int x[]=new int [4];//x is an array
         x[0]=17;
		 x[1]=-4;
		 x[2]=3;

 System.out.println(x);//prints a memory address
 System.out.println(x[0]);
 System.out.println(x[1]);

 System.out.print(" ");

    x[4]=6; //causes an error,array being out of bounds

 System.out.println("after the exception");

}
}