import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Picture_Puzzle extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sam,con;
    JLabel s1,s2;
    Icon star,m1,m2;
    int i=0;

    public Picture_Puzzle()  {
        super("Picture Puzzle - Boredome Reliver");
        b1 = new JButton(new ImageIcon("src/Pics/26.jpg"));
        b2 = new JButton(new ImageIcon("src/Pics/23.jpg"));
        b3 = new JButton(new ImageIcon("src/Pics/21.jpg"));
        b4 = new JButton(new ImageIcon("src/Pics/25.jpg"));
        b5 = new JButton(new ImageIcon("src/Pics/24.jpg"));
        b6 = new JButton(new ImageIcon("src/Pics/28.jpg"));
        b7 = new JButton(new ImageIcon("src/Pics/22.jpg"));
        b8 = new JButton(new ImageIcon("src/Pics/27.jpg"));
        b9 = new JButton(new ImageIcon("src/Pics/29.jpg"));
        sam = new JButton(new ImageIcon("src/Pics/main1.jpg"));
        con = new JButton(new ImageIcon("src/Pics/c1.jpg"));
        s1 = new JLabel("This has the power of an empty block");
        s2 = new JLabel("Target Image");
        b1.setBounds(10,80,100,100);
        b2.setBounds(110,80,100,100);

        b3.setBounds(210,80,100,100);

        b4.setBounds(10,180,100,100);

        b5.setBounds(110,180,100,100);

        b6.setBounds(210,180,100,100);

        b7.setBounds(10,280,100,100);

        b8.setBounds(110,280,100,100);

        b9.setBounds(210,280,100,100);

        sam.setBounds(380,100,200,200);
        /*JLabel l1=new JLabel("Target image:");
        l1.setBounds(330,200,70,20);
        JLabel l2=new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
        l2.setBounds(5,15,500,20);
        JLabel l3=new JLabel("click target Image to toggle next puzzle");
        l3.setBounds(380,320,200,20);
        l3.setForeground(Color.red);*/


        con.setBounds(330,5,50,50);
        s1.setBounds(270,50,500,25);
        star=b9.getIcon();
        add(s1);
        m1 = new ImageIcon("src/Pics/main1.jpg");
        m2 = new ImageIcon("src/Pics/main2");


        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sam);add(con);/*add(l1);add(l2);;add(l3);*/
        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);
        sam.addActionListener(this);
        setLayout(null);
        setSize(600,500);
        setVisible(true);
        if(b1.getIcon() == new ImageIcon("src/Pics/1.jpg") && b2.getIcon() == new ImageIcon("src/Pics/2.jpg")  && b3.getIcon() == new ImageIcon("src/Pics/3.jpg")
        && b4.getIcon() == new ImageIcon("src/Pics/4.jpg") && b5.getIcon() == new ImageIcon("src/Pics/5.jpg") && b6.getIcon() == new ImageIcon("src/Pics/6.jpg")
        && b7.getIcon() == new ImageIcon("src/Pics/7.jpg") && b8.getIcon() == new ImageIcon("src/Pics/8.jpg") && b9.getIcon() == new ImageIcon("src/Pics/9.jpg"))
        {
            JOptionPane.showInputDialog("You have won!");
            sam.setIcon(new ImageIcon("src/Pics/main2.jpg"));
            b1.setIcon(new ImageIcon("src/Pics/1.jpg"));
            b2.setIcon(new ImageIcon("src/Pics/4.jpg"));
            b3.setIcon(new ImageIcon("src/Pics/5.jpg"));
            b4.setIcon(new ImageIcon("src/Pics/6.jpg"));
            b5.setIcon(new ImageIcon("src/Pics/8.jpg"));
            b6.setIcon(new ImageIcon("src/Pics/9.jpg"));
            b7.setIcon(new ImageIcon("src/Pics/7.jpg"));
            b8.setIcon(new ImageIcon("src/Pics/2.jpg"));
            b9.setIcon(new ImageIcon("src/Pics/3.jpg"));
            star=b9.getIcon();
            con.setIcon(new ImageIcon("src/Pics/c2.jpg"));

        }
        if(b1.getIcon() == new ImageIcon("src/Pics/21.jpg") && b2.getIcon() == new ImageIcon("src/Pics/22.jpg")  && b3.getIcon() == new ImageIcon("src/Pics/23.jpg")
                && b4.getIcon() == new ImageIcon("src/Pics/24.jpg") && b5.getIcon() == new ImageIcon("src/Pics/25.jpg") && b6.getIcon() == new ImageIcon("src/Pics/26.jpg")
                && b7.getIcon() == new ImageIcon("src/Pics/27.jpg") && b8.getIcon() == new ImageIcon("src/Pics/28.jpg") && b9.getIcon() == new ImageIcon("src/Pics/29.jpg"))
        {
            sam.setIcon(new ImageIcon("src/Pics/main1.jpg"));
            b1.setIcon(new ImageIcon("src/Pics/26.jpg"));
            b2.setIcon(new ImageIcon("src/Pics/23.jpg"));
            b3.setIcon(new ImageIcon("src/Pics/21.jpg"));
            b4.setIcon(new ImageIcon("src/Pics/25.jpg"));
            b5.setIcon(new ImageIcon("src/Pics/24.jpg"));
            b6.setIcon(new ImageIcon("src/Pics/28.jpg"));
            b7.setIcon(new ImageIcon("src/Pics/22.jpg"));
            b8.setIcon(new ImageIcon("src/Pics/27.jpg"));
            b9.setIcon(new ImageIcon("src/Pics/29.jpg"));
            star = b9.getIcon();
            con.setIcon(new ImageIcon("src/Pics/c1.jpg"));
        }
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==b1){
            Icon s1=b1.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b1.setIcon(star);
            } else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b1.setIcon(star);
            }
        }


        if(e.getSource()==b2){
            Icon s1=b2.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b2.setIcon(star);
            }
            else if(b3.getIcon()==star){
                b3.setIcon(s1);
                b2.setIcon(star);
            }
        }

        if(e.getSource()==b3){
            Icon s1=b3.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b3.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b3.setIcon(star);
            }
        }

        if(e.getSource()==b4){
            Icon s1=b4.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b4.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b4.setIcon(star);
            }
            else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b4.setIcon(star);
            }
        }

        if(e.getSource()==b5){
            Icon s1=b5.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b5.setIcon(star);
            } else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b5.setIcon(star);
            }
        }

        if(e.getSource()==b6){
            Icon s1=b6.getIcon();
            if(b3.getIcon()==star){
                b3.setIcon(s1);
                b6.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b6.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b6.setIcon(star);
            }
        }

        if(e.getSource()==b7){
            Icon s1=b7.getIcon();
            if(b4.getIcon()==star){
                b4.setIcon(s1);
                b7.setIcon(star);
            } else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b7.setIcon(star);
            }
        }

        if(e.getSource()==b8){
            Icon s1=b8.getIcon();
            if(b7.getIcon()==star){
                b7.setIcon(s1);
                b8.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b8.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b8.setIcon(star);
            }

        }

        if(e.getSource()==b9){
            Icon s1=b9.getIcon();
            if(b8.getIcon()==star){
                b8.setIcon(s1);
                b9.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b9.setIcon(star);
            }
        }

        if(e.getSource() == sam)
        {
            i++;
            if(i%2!=0){

                sam.setIcon(new ImageIcon("src/Pics/main2.jpg"));
                b1.setIcon(new ImageIcon("src/Pics/1.jpg"));
                b2.setIcon(new ImageIcon("src/Pics/4.jpg"));
                b3.setIcon(new ImageIcon("src/Pics/5.jpg"));
                b4.setIcon(new ImageIcon("src/Pics/6.jpg"));
                b5.setIcon(new ImageIcon("src/Pics/8.jpg"));
                b6.setIcon(new ImageIcon("src/Pics/9.jpg"));
                b7.setIcon(new ImageIcon("src/Pics/7.jpg"));
                b8.setIcon(new ImageIcon("src/Pics/2.jpg"));
                b9.setIcon(new ImageIcon("src/Pics/3.jpg"));
                star=b9.getIcon();
                con.setIcon(new ImageIcon("src/Pics/c2.jpg"));
            }
            if(i%2==0)
            {
                sam.setIcon(new ImageIcon("src/Pics/main1.jpg"));
                b1.setIcon(new ImageIcon("src/Pics/26.jpg"));
                b2.setIcon(new ImageIcon("src/Pics/23.jpg"));
                b3.setIcon(new ImageIcon("src/Pics/21.jpg"));
                b4.setIcon(new ImageIcon("src/Pics/25.jpg"));
                b5.setIcon(new ImageIcon("src/Pics/24.jpg"));
                b6.setIcon(new ImageIcon("src/Pics/28.jpg"));
                b7.setIcon(new ImageIcon("src/Pics/22.jpg"));
                b8.setIcon(new ImageIcon("src/Pics/27.jpg"));
                b9.setIcon(new ImageIcon("src/Pics/29.jpg"));
                star = b9.getIcon();
                con.setIcon(new ImageIcon("src/Pics/c1.jpg"));
            }
        }

    }

    public static void main(String[] args) {
        new Picture_Puzzle();

    }
}
