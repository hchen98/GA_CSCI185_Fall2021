package lab1;

public class Rectangle {

  private double height, width;

  public Rectangle() {
    //  default constructor
    this.height = 1.0;
    this.width = 1.0;
  }

  public Rectangle(double h, double w) {
    this.height = h;
    this.width = w;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public double getWidth() {
    return width;
  }

  public double getArea(){
    return getHeight() * getWidth();
  }

  public double getPerimeter(){
    return 2 * (getWidth() + getHeight());
  }

  public String toString(){
    return "Rectangle info: \n" + "Height: " + getHeight() + "\nWidth" + getWidth() + "\nArea" + getArea() + "\nPerimeter" + getPerimeter();
  }
}
