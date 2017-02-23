class A{
         void e(){
         System.out.println("e method");
         }

         void d(){
         System.out.println("d method");
      }
         int x=50;
}

class B{
         int y=20;

         void m(){
         System.out.println("m method");
         }
}
class Best{
         public static void main( String oshani[]){

         A a = new A();
         B b = new B();

         b.m();
         a.d();
         System.out.println(a.x);
         System.out.println(b.y);
         a.e();

         }
}



