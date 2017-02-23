class Pure{
          double add(double x, double y){
          return x+y;
}
          void avg(double z){
          System.out.println("The average = "+z/2);
}
          public static void main(String oshani[]){
          Pure p=new Pure();

          double k=p.add(3.5, 6.2);
          p.avg(k);
}
}