import java.util.*;
import java.lang.*;
import java.io.*;

class MaxMinusMin{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner read = new Scanner(System.in);
	 int t = read.nextInt();
	 for(int i=0;i<t;i++){
	         int A = read.nextInt();
	         int B = read.nextInt();
	         int C = read.nextInt();
	         int Maax = Math.max(A, Math.max(B, C));
           int Miin = Math.min(A, Math.min(B, C));
	         System.out.println(Maax-Miin);
}
	}
}
