package net.labymod.serverapi.common.widgets.util;

/**
 * Anchor position on the screen for component orientation
 *
 * @param x Anchor x position in percent.<br><br>Examples:<br> 0% would be on the left side of the
 *          screen.<br>50% is in the middle of the screen.
 * @param y Anchor y position in percent<br><br>Examples:<br> 0% would be on the top side of the
 *          screen.<br>50% is in the middle of the screen.
 * @author LabyStudio
 */
public record Anchor(double x, double y) {

  /**
   * Create anchor for orientation
   *
   * @param x Anchor x percentage (0 - 100)
   * @param y Anchor y percentage (0 - 100)
   */
  public Anchor {
  }

  /**
   * Get the anchor x percentage
   *
   * @return Anchor x percentage
   */
  @Override
  public double x() {
    return x;
  }

  /**
   * Get the anchor y percentage
   *
   * @return Anchor y percentage
   */
  @Override
  public double y() {
    return y;
  }

}
