import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter bp = new BackgroundPainter();
    bp.paintBackground();

    EggPainter ep = new EggPainter();
    ep.paintEgg("white");

    YolkPainter yp = new YolkPainter();
    yp.paintYolk("yellow");
  }
}
