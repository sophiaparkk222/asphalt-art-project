import org.code.neighborhood.*;

public class YolkPainter extends PainterPlus {

  /**
   * Paints the yellow yolk inside the egg.
   *
   * @param color the color used to paint the yolk
   */
  public void paintYolk(String color) {

    setPaint(1000);

    move();
    move();
    move();
    move();

    turnRight();

    move();
    move();
    move();
    move();

    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);
    move();
    paint(color);

    turnLeft();
    move();
    paint(color);

    // Move the painter away from the egg.
    move();
    move();
    move();
    move();
    move();

    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
  }
}
