import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI implements ActionListener {

    private JFrame f;
    private JPanel p;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private MainUI()
    {
        f= new JFrame("Boredom Reliever");
        p=new JPanel(new GridLayout(3,3,20,20));
        p.setBounds(40,40,200,200);
        p.setBackground(Color.gray);

        b1 = new JButton("");
        b2 = new JButton("Picture Puzzle");
        b3 = new JButton("");
        b4 = new JButton("Number Puzzle");
        b5 = new JButton("Calculator");
        b6 = new JButton("Tic Tac Toe");
        b7 = new JButton("");
        b8 = new JButton("Notepad");
        b9 = new JButton("");
        b2.setForeground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.BLACK);
        b6.setForeground(Color.BLACK);
        b8.setForeground(Color.WHITE);

        b2.setBackground(Color.ORANGE);
        b4.setBackground(Color.red);
        b5.setBackground(Color.PINK);
        b6.setBackground(Color.green);
        b8.setBackground(Color.blue);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        f.setSize(screenSize.width,screenSize.height);
        p.setBounds(screenSize.height/4 + 250,screenSize.width/4 - 200,650,500);
        f.setLayout(null);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1538,830);
        b2.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b8.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new MainUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  b2)
        {
            Picture_Puzzle k =  new Picture_Puzzle();
        }
        if(e.getSource()== b4)
        {
            Number_Puzzle k =new Number_Puzzle();
        }
        if(e.getSource() == b5)
        {
            Calculator k = new Calculator();
        }
        if(e.getSource() == b6)
        {
            TicTacToe k = new TicTacToe();
        }
        if(e.getSource()==b8)
        {
        	Notepad k = new Notepad();
        }
    }
}
