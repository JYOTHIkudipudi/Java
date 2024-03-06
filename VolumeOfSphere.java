import java.util.*;
class VolumeOfSphere{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int Radius = read.nextInt();
    double Volume = (4.0/3.0)*(3.14*Math.pow(Radius,3));
    System.out.printf("%.2f",Volume);
  }
}
