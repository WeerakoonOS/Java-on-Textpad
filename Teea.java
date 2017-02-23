class Teea{

void add(int... x){//0 to many arguments can be performed,x is an array
System.out.println(x[0]);
System.out.println(x);

}
public static void main(String oshani[]){
 Teea t=new Teea();
 t.add(345,8,75);
 t.add(67,999);

}
}