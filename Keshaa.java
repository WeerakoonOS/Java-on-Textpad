class Keshaa{

public static void main(String oshani[]){
	String a="abc";
	String b="abc";
	String c="ABC";//ABc tibbat true
	String d="def";

 if (a.equalsIgnoreCase(c)){//case will be ignored when comparing

System.out.println("true");
}else{
System.out.println("false");
}
}
}