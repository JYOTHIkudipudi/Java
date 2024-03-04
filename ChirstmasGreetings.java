import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class ChristmasGreetings
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner read = new Scanner(System.in);
         int Day = read.nextInt();
         if(Day==25){
                 System.out.print("Happy CHRISTMAS");
         }
         else{
                 System.out.print("ORDINARY");
         }
	}
}
