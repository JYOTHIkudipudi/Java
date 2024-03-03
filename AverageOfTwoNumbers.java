import java.util.*;
public class AverageOfTwoNumbers{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    float A = read.nextFloat();
    float B = read.nextFloat();
    float Average = (A+B)/2.0;
    System.out.printf("%.4f",Average);
  }
}
