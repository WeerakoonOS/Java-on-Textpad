class Tusk{

void add(int... x){//0 to many arguments can be performed,x is an array
    int total=0;
    for (int i=0;i<x.length;i++){
	 total=total+x[i];
 }
 System.out.println("sum = "+total);
}

public static void main(String oshani[]){
 Tusk t=new Tusk();
 t.add(3,-8,-7,2,9);//arrays will be generated in each call
 t.add(7,-9);

}
}