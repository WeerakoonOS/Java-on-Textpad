class Calculator{
            int x=20, y=50;

            void add(){
            System.out.println(x+y);
            }
            void subs(){
	        System.out.println(x-y);
            }
            void mul(){
            System.out.println(x*y);
            }
            void div(){
	        System.out.println(x/y);
            }
            void mod(){
	        System.out.println(x%y);
            }

            public static void main(String oshani[]){

               Calculator c = new Calculator();
               c.add();
               c.subs();
               c.mul();
               c.div();
               c.mod();

				}

}