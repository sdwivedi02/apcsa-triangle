import java.util.Scanner;

public class Trapezoid {
public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

  double top;
  double bottom;
  double height;
  double area;

  System.out.print("Enter Height: ");
  String height = in.nextLine();

  System.out.print("Enter Top: ");
  String top = in.nextLine();

  System.out.print("Enter Bottom: ");
  String top = in.nextLine();

  area = ((top + bottom)/2)* height;

   System.out.println("The area of the trapezoid is " + area + ".");
}
}
