import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  /**
   * Turns the painter 90 degrees to the right.
   */
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /**
   * Takes all available paint from the bucket.
   */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  /**
   * Moves the painter forward until it cannot move.
   */
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  /**
   * Paints until the painter runs out of paint.
   *
   * @param color the color used to paint
   */
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      } else {
        break;
      }
    }
  }

  /**
   * Creates a donut-shaped pattern.
   *
   * @param color the color used to paint
   */
  public void paintDonut(String color) {
    while (hasPaint() && canMove()) {
      move();
      turnRight();
      paint(color);

      if (canMove()) {
        move();
        paint(color);
      }
    }
  }
}
