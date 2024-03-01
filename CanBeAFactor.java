import java.util.Scanner;
public class CanBeAFactor{
public static void main(String[] args){
  Scanner read = new Scanner(System.in);
  int T = read.nextInt();
  for(int i=0;i<T;i++){
      int A = read.nextInt();
      int B = read.nextInt();
      if(B%A==0){
          System.out.println("YES");
      }
      else if(B>A*2){
          System.out.println("YES");
      }
      else{
          System.out.println("NO");
        }
      }
    }
}
