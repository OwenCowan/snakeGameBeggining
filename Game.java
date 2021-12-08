import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game
implements KeyListener //Records keystrokes and activates functions, hover over and implement the three methods
{

    private Snake player;

    private Food food;

    private Graphics graphics;

    private JFrame window; //Here is where we will edit the dimension under the frame variable

    public static final int width = 20;
    public static final int height = 20;
    public static final int dimension = 20;


    public Game() {

        window = new JFrame(); //JFrame is the window the game will be played in

        window.setTitle("Snake"); //This is setting the title for the top of the J frame
        window.setSize(width * dimension, height * dimension); // Making the dimensions so it's a square
        window.setVisible(true); // Making the JFrame actually visible
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when we close it, it will kill the window. Visible red X

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) { //We are only using key pressed
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) { //This says if W is pressed snake will move up
            player.up();
        }
        else if (keyCode == KeyEvent.VK_S) { //This says if S is pressed snake will move down
            player.down();
        }
        else if (keyCode == KeyEvent.VK_A) { //This says if A is pressed snake will move right
            player.left();
        }
        else {
            player.right();
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
