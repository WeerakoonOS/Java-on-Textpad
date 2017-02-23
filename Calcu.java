class Calcu{

           void add(double x, double y){
           System.out.println(x+y);
           }
           void subs(double x, double y){
	       System.out.println(x-y);
           }
           void mul(double x, double y){
	       System.out.println(x*y);
           }
           void div(double x, double y){
	       System.out.println(x/y);
           }
           void mod(double x, double y){
	       System.out.println(x%y);
           }

           public static void main(String oshani[]){

			Calcu c = new Calcu();

			c.add(4.56, 23.7);
			c.subs(4.56, 23.7);
			c.mul(4.56, 23.7);
			c.div(4.56, 23.7);
			c.mod(4.56, 23.7);

			}

}