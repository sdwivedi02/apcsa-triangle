import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

  int height;
  int base;
  int area;

  System.out.print("Enter Height: ");
  int height = in.nextLine();

  System.out.print("Enter Base: ");
  int base = in.nextLine();

  area = (base * height)/2;
   System.out.println("The area of a triangle with a height and base of "+height+" and "+base+" is "+area);
}
}
