import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

 // turns bp painter after each row is filled in with black paint
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();

      if (canMove()) {
        move();
      }

      turnLeft();
    }
  }

// covers the entire background with black paint 
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
  }
}