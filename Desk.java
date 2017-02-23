import java.util.Scanner;
//declaring multiple classes
    class Student{
	String name;
	int age;
	String nic;
	String city;
	}

	class Desk{

	void printStudent(Student z){
	System.out.println(z.name);
    System.out.println(z.age);
	System.out.println(z.nic);
	System.out.println(z.city);
}

     Student setName(Student y){
        y.name="Ashani";
        return y;
}

      public static void main(String oshani[]){
      Scanner s=new Scanner(System.in);
      Student t=new Student();

     System.out.println("Enter the Student's information _");
     System.out.print("Name : ");
     t.name=s.next();

     System.out.print("Age : ");
     t.age=s.nextInt();

     System.out.print("NIC : ");
     t.nic=s.next();

     System.out.print("City : ");
     t.city=s.next();

	Desk d=new Desk();
     d.printStudent(t);
System.out.println("current Name : "+t.name);

     d.setName(t);
System.out.println("new Name : "+t.name);

}
     }