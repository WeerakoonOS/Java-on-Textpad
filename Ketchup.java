class Ketchup{

   void m(String a,double... x){
	System.out.println("m method");
}

   void n(int x,int... y){
	System.out.println("n method");
}

// void d(int... y,int x){var arg cant be come as the first of the parameter list
//System.out.println("d method");
//}

public static void main(String oshani[]){

	Ketchup k = new Ketchup();
	k.m("abc");
	k.m("abc",6.77,3.8);

	k.n(23,7,9,2);
	k.n(56);
	//k.n();compile error

	//k.d(4,6,8);
}
}