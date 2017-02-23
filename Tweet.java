import java.util.Scanner;

class Tweet{
int [] getMarks(){//to return an int array

int []x=new int[3];//x is an int array

Scanner s=new Scanner(System.in);

for (int i=0;i<x.length;i++){
	    System.out.print("Subject "+(i+1)+" : ");
                   x[i]=s.nextInt();
	}
	return x;//referance of an int array will be returned
}

void getAvg(int a[]){
    int total=0;
 for (int i=0;i<a.length;i++){
	 total=total+a[i];
	 }
    System.out.println("The avg = "+(total/a.length));

	}
public static void main(String oshani[]){

	Tweet t=new Tweet();
	int z[]=t.getMarks();
	t.getAvg(z);
// t.getAvg(t.getMarks());another method to call but nt good


	}

}