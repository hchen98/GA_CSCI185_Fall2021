import lab1.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab1Test {

  private final Rectangle r1 = new Rectangle();
  private final Rectangle r2 = new Rectangle(40.0, 4.0);

  @Test
  void test_dataType() {
    assertAll("data type test",
        () -> assertTrue(Double.class.isInstance(r1.getWidth())),
        () -> assertTrue(Double.class.isInstance(r2.getHeight()))
    );
  }

  @Test
  void test_default_constructor() {
    double ans = 1.0;
    assertAll("initialization the default constructor",
        () -> assertEquals(ans, r1.getHeight()),
        () -> assertEquals(ans, r1.getWidth())
    );
  }

  @Test
  void test_area() {
    double ans = 1.0;
    assertEquals(ans, r1.getArea());
  }

  @Test
  void test_perimeter() {
    double ans = 88.0;
    assertEquals(ans, r2.getPerimeter());
  }

  @Test
  void test_random_area(){
    double w = Math.random();
    double h = Math.random();
    double ans = w * h;

    Rectangle random_area = new Rectangle(h, w);
    assertEquals(ans, random_area.getArea());
  }

  @Test
  void test_random_perimeter(){
    double w = Math.random();
    double h = Math.random();
    double ans = 2*(w + h);

    Rectangle random_area = new Rectangle(h, w);
    assertEquals(ans, random_area.getPerimeter());
  }

}
