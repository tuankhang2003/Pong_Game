import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.lang.reflect.GenericArrayType;

public class GameFrame extends JFrame implements ActionListener {
    GamePanel panel;
    JButton start=new JButton("start");
    JButton exit=new JButton("exit");
    JButton highscore=new JButton("HighScore");
    JButton restart=new JButton("restart");
    static final int SCREEN_WIDTH=GamePanel.GAME_WIDTH;
    static final int SCREEN_HEIGHT=600;
    static final int BUTTON_WIDTH=350;
    static final int BUTTON_HEIGHT=100;


    GameFrame(){

        panel=new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void changeButtonToStart(){
        restart.setBounds((SCREEN_WIDTH-BUTTON_WIDTH)/2,GamePanel.GAME_HEIGHT+50,BUTTON_WIDTH-100,BUTTON_HEIGHT-50);
        restart.setFont(new Font("Ink Free", Font.BOLD, 40));
        restart.setForeground(Color.RED);
        restart.setFocusable(false);
        restart.addActionListener(this);
        this.add(restart);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
