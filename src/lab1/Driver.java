package lab1;

public class Driver {
  public static void main(String arg[]){
    //  refers to the default constructor
    Rectangle r1 = new Rectangle();

    // refers to the arg constructor
    Rectangle r2 = new Rectangle(40.0, 4.0);

    System.out.println("Area of r1: " + r1.getArea());
    System.out.println("Perimeter of r2: " + r2.getPerimeter());



    // Alternative implementation of Lab 1
    Rectangle[] r = new Rectangle[2];

    r[0] = new Rectangle();
    r[1] = new Rectangle(40.0, 4.0);

    System.out.println("Area of r1: " + r[0].getArea());
    System.out.println("Perimeter of r2: " + r[1].getPerimeter());
  }
}


