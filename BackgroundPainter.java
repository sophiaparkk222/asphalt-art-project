import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  /**
   * Paints one complete row with the specified color.
   *
   * @param color the color used to paint the row
   */
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  /**
   * Turns the painter around and moves it to the next row.
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();

      if (canMove()) {
        move();
      }

      turnLeft();
    }
  }

  /**
   * Paints the entire background black.
   */
  public void paintBackground() {
    setPaint(2000);

    paint("black");
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");
  }
}
