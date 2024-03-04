import java.util.*;
import java.lang.*;
import java.io.*;
class SecondMaxNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner read = new Scanner(System.in);
          int N = read.nextInt();
          for(int i=0;i<N;i++){
                  int a = read.nextInt();
                  int b = read.nextInt();
                  int c = read.nextInt();
                  if((a < b && b < c) || (c < b && b < a)){
                          System.out.println(b);
                  }
                  else if ((b < a && a < c) || (c < a && a < b)){
                          System.out.println(a);
                  }
                  else{
                          System.out.println(c);
                  }
          }
	}
}
