import java.util.Scanner;
/**
 *
 * @author Isaac
 */
public class Main {

  /** this program tells the user what order the numbers that they put in go first
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println ("Please enter a number.");
    int first_number = input.nextInt();
    System.out.println ("please enter a second number.");
    int second_number = input.nextInt();

    if (first_number < second_number) {
      System.out.println ("The order of these numbers are " + first_number + ", " + second_number + ".");
    }
    else if (first_number > second_number) {
      System.out.println ("The order of these numbers are " + second_number + ", " + first_number + ".");
    }
    else if (first_number == second_number) {
      System.out.println ("The order of these numbers are " + first_number + ", " + second_number + ".");
    }


  }
}
