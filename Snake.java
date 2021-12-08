import java.awt.*;
import java.lang.reflect.RecordComponent;
import java.util.ArrayList;

public class Snake {
    //Array list of rectangles, that are in line and expandable one rectangle = one full grid
    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;
    private String move; //Nothing, UP, LEFT, RIGHT

    public Snake() {
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(Game.dimension, Game.dimension) //We are calling our dimensions from the game class to create the snake, also its temporary because it can grow
        temp.setLocation(w / 2 * d, h / 2 * d); //This is the math to center our snake in the middle of the screen
        body.add(temp); //This is a temp rectangle

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 1) * d, (h / 2 - 1) * d); // This is another rectangle just the math on its location - 1 is one to the left
        body.add(temp);

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d); // This is another rectangle just the math on its location - 2 is two to the left
        body.add(temp);

        move = "NOTHING"; //It will wait to move until 1st keystroke

    }

    public ArrayList<Rectangle> getBody() { //Getter
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) { //Setter
        this.body = body;
    }

    //MOVEMENT controls
    public void up() {
        move = "UP";
    }

    public void down() {
        move = "DOWN";
    }

    public void left() {
        move = "LEFT";
    }

    public void right() {
        move = "RIGHT";
        }

}
