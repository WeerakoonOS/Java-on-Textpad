import java.util.Scanner;

class Pepper{
void kmTomiles(int km){
                Scanner c=new Scanner(System.in);
            System.out.println("Convert km to miles-1");
		    System.out.println("Convert miles to km-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int b=c.nextInt();
            System.out.println("");

                   if(b==1){

				System.out.print("km :");
				int e=c.nextInt();
				System.out.println(e+" km = "+(e/0.621371)+" Miles");
                    }else{
        System.out.print("Miles :");
        int d=c.nextInt();
		System.out.println(d+" Miles = "+(d*0.621371)+" km");

}
}
void celciusTofahrenheit(int cel){
                Scanner a=new Scanner(System.in);
            System.out.println("Convert Celcius to Fahrenheit-1");
		    System.out.println("Convert Fahrenheit to Celcius-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int f=a.nextInt();
			System.out.println("");

                   if(f==1){

		System.out.print("Celcius :");
        int g=a.nextInt();
		System.out.println(g+" Celcius = "+(g+32)+" Fahrenheit");
                    }else{

		System.out.print("Fahrenheit :");
		int h=a.nextInt();
		System.out.println(h+" Fahrenheit = "+(h-32)+" Celcius");
}
}
void kilogramsTopounds(int kilo){
                Scanner n=new Scanner(System.in);
            System.out.println("Convert kilograms to pounds-1");
		    System.out.println("Convert pounds to kilograms-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int i=n.nextInt();
			System.out.println("");

                   if(i==1){

				System.out.print("kg :");
				int k=n.nextInt();
				System.out.println(k+" kg = "+(k*2.20462)+" pounds");
                    }else{
				System.out.print("pounds :");
		        int j=n.nextInt();
				System.out.println(j+" pounds = "+(j/2.20462)+" kg");
   }
}

void metersTofeet(int m){
                Scanner e=new Scanner(System.in);
            System.out.println("Convert meters to feet-1");
		    System.out.println("Convert feet to meters-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int l=e.nextInt();
            System.out.println("");

                   if(l==1){

		System.out.print("meters :");
        int n=e.nextInt();
		System.out.println(n+" meters = "+(n*3.28084)+" feet");
                    }else{

		System.out.print("feet :");
		int o=e.nextInt();
		System.out.println(o+" feet = "+(o/3.28084)+" m");
}
}
void inchesTocentimeters(int i){
                Scanner r=new Scanner(System.in);
            System.out.println("Convert inches to centimeters-1");
		    System.out.println("Convert centimeters to inches-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int q=r.nextInt();
            System.out.println("");

                   if(q==1){

		System.out.print("inches :");
        int d=r.nextInt();
		System.out.println(d+" inches = "+(d*2.54)+" cm");
                    }else{

		System.out.print("centimeters :");
		int e=r.nextInt();
		System.out.println(e+" centimeters = "+(e/2.54)+" inches");
}
}
void inchesTofeet(int f){
                Scanner w=new Scanner(System.in);
            System.out.println("Convert inches to feet-1");
		    System.out.println("Convert feet to inches-2");
		    System.out.println("");
			System.out.print("Make the selection : ");
		            int b=w.nextInt();
            System.out.println("");

                   if(b==1){

		System.out.print("inches :");
        int d=w.nextInt();
		System.out.println(d+" inches = "+(d/12)+" feet");
                    }else{

		System.out.print("feet :");
		int e=w.nextInt();
		System.out.println(e+" feet = "+(e*12)+" inches");
}

}


	public static void main(String oshani[]){
     System.out.print("Which metric conversion do you need to perform?");
     System.out.println("Enter the respective integer to proceed");
     System.out.println("");

System.out.println("km to miles-1");
System.out.println("Celcius to Fahrenheit-2");
System.out.println("kilograms to Pounds-3");
System.out.println("Meters to feet-4");
System.out.println("Inches to Centimeters-5");
System.out.println("Inches to feet-6");

     Scanner s=new Scanner(System.in);
     Pepper p=new Pepper();

       System.out.println("");
       System.out.print("Enter the Number : ");
       int a=s.nextInt();

	   System.out.println("");

      if(a==1){
		  p.kmTomiles(a);
           }else if(a==2){
		  p.celciusTofahrenheit(a);
		   }else if(a==3){
		  p.kilogramsTopounds(a);
		   }else if(a==4){
		  p.metersTofeet(a);
		   }else if(a==5){
		  p.inchesTocentimeters(a);
		   }else{
		  p.inchesTofeet(a);
}

		  }
		  }


