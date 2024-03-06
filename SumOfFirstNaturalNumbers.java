// print the sum of first natural numbers without using loop
import java.util.*;
class SumOfFirstNumbers{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    int N = read.nextInt();
    int result = N*(N+1)/2;
    System.out.pritnf("%d",result);
  }
}
