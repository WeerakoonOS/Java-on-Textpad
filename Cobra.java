class Cobra{
public static void main(String oshani[]){
                    A:
for(int x=0;x<4;x++){//outer loop
 System.out.print("Outer");

                   B:
for(int y=0;y<3;y++){//inner loop
 System.out.println("Inner");
break A;}//breaking the outer loop being in inner loop
}
}
}
