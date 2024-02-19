
/**
 * .
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-02-08
 */

import java.util.Scanner;

final public class VolSphere {
  /**
   * Private constructor to prevent instantiation of this utility class.
   */
  private VolSphere() {
  }

  /**
   * The main method calculates volume of a sphere.
   * 
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(String[] args) {
    // import scanner and getting user radius from user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius (cm): ");
    double radius = sc.nextDouble();

    // volume calculations
    double volume = (4d / 3d) * Math.PI * radius;

    // prints volume to console
    System.out.println(volume);

    // close scanner
    sc.close();
  }
}
