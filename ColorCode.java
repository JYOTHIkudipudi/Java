import java.util.*;
public class ColorCode{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    char C = read.next().charAt(0);
    switch(Character.toUpperCase(C)) {
      case 'V':
          System.out.println("Violet");
          break;
      case 'I':
          System.out.println("Indigo");
          break;
        case 'B':
          System.out.println("Blue");
          break;
        case 'G':
          System.out.println("Green");
          break;
        case 'Y':
          System.out.println("Yellow");
          break;
        case 'O':
          System.out.println("Orange");
        case 'R':
          System.out.println("Red");
        defualt:
        System.out.println("Color Not Found");
      }
  }
}
