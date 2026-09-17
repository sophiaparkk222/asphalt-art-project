import org.code.neighborhood.*;


public class YolkPainter extends PainterPlus {
public void paintYolk(String color) {

  setPaint(1000);
  //setting enough paint for the painter 
  move();
  move();
  move();
  move();

  turnRight();
  move();
  move();
  move();
  move();

  //moving the painter to the right spot before painting everything yellow for yolk
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  turnLeft();
  move();
  paint("yellow");
  move();
  paint("yellow");
  turnLeft();
  move();
  paint("yellow");

  turnLeft();
  move();
  paint("yellow");

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

  //moves the painter to the corner of grid so the picture isn't obstructed
}
}
