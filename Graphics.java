import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics
extends JPanel
implements ActionListener { //It redraws every frame, frame by frame
    private Timer t = new Timer(100, this);
    public String state;

    private  Snake s;
    private Food f;
    private Game game;

    public Graphics(Game g) {
        t.start();
        state = "START";

        game = g;
        s =s

    }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g); //This is a drawing tool / frame designer

        Graphics2D g2d = (Graphics2D) g;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // calling paint component

    }
}
