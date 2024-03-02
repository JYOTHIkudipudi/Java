import java.util.Scanner;
public class NumberOfHandshakes{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int result =(n*(n-1))/2;
        System.out.print(result);
    }
}
