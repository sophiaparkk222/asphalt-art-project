import org.code.neighborhood.*;

public class EggDetailPainter extends PainterPlus {

  /**
   * Paints a small detail using the specified color.
   *
   * @param color the color used to paint the detail
   */
  public void paintDetail(String color) {
    setPaint(20);

    if (canMove()) {
      paint(color);
      move();
    }

    if (canMove()) {
      paint(color);
    }
  }
}
