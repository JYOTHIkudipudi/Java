import java.util.*;
public class HeronsFormula{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int X = read.nextInt();
    int Y = read.nextInt();
    int Z = read.nextInt();
    double S = (X+Y+Z)/2.0;
    double Heron;
    Heron = Math.sqrt(S*(S-a)*(S-b)*(S-c));
    System.out.printf("%.4f",Heron);
  }
}
    
