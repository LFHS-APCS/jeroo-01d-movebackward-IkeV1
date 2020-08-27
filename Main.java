/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
  Jeroo a = new Jeroo(5, 5, SOUTH, 100);
  a.turn(LEFT);
  a.turn(LEFT);
  a.hop();
  a.turn(LEFT);
  a.turn(LEFT);
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
       Jeroo kim = new Jeroo(3,4);
       kim.moveBackward();
    }

}
