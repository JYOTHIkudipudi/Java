import java.util.*;
class CompareTwoStrings{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    String S1 = read.nextLine();
    String S2 = read.nextLine();
    if(S1.equals(S2)){
      System.out.println("Strings are Equal");
    }
    else{
      System.out.println("Strings are Not Equal");
    }
  }
}
