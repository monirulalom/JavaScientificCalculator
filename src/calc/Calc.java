package calc;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JFrame.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Calc {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/calc/icon.png")).getImage());

        frame.setSize(600, 600);
        frame.setResizable(false);

        JMenuBar menubar = new JMenuBar();
        JMenuItem menu = new JMenuItem("Credits");
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        JFrame credits = new JFrame();
        credits.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/calc/icon.png")).getImage());
        credits.setTitle("Credits");
        credits.setSize(250, 250);
        JLabel text = new JLabel("<html>Made by Team Vikings<br>Members<br>Md. Monirul Alom (Team leader) <br> Sheher Jahan Rashni <br> Sadia Afrin Misti <br> Moshiur Rahman Khan <br>K M Salman Tahery Hossain</html>", SwingConstants.CENTER);
        credits.add(text);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                credits.setVisible(true);
            }
        });

        JTextField result = new JTextField("", 20);
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setBounds(20, 20, 550, 30);
        frame.add(result);

        JButton btnforpoint = new JButton(".");
        JButton btnfordigit0 = new JButton("0");
        JButton btnforplusminus = new JButton("±");
        JButton btnforequal = new JButton("=");
        JButton btnfordigit1 = new JButton("1");
        JButton btnfordigit2 = new JButton("2");
        JButton btnfordigit3 = new JButton("3");
        JButton btnforplus = new JButton("+");
        JButton btnfordigit4 = new JButton("4");
        JButton btnfordigit5 = new JButton("5");
        JButton btnfordigit6 = new JButton("6");
        JButton btnforminus = new JButton("-");
        JButton btnfordigit7 = new JButton("7");
        JButton btnfordigit8 = new JButton("8");
        JButton btnfordigit9 = new JButton("9");
        JButton btnformulti = new JButton("*");
        JButton btnforbksp = new JButton("←");
        JButton btnforc = new JButton("C");
        JButton btnforroot = new JButton("√");
        JButton btnfordivide = new JButton("/");

        btnforpoint.setBounds(30, 480, 50, 50);
        btnfordigit0.setBounds(90, 480, 50, 50);
        btnforplusminus.setBounds(150, 480, 50, 50);
        btnforequal.setBounds(210, 480, 50, 50);
        btnfordigit1.setBounds(30, 400, 50, 50);
        btnfordigit2.setBounds(90, 400, 50, 50);
        btnfordigit3.setBounds(150, 400, 50, 50);
        btnforplus.setBounds(210, 400, 50, 50);
        btnfordigit4.setBounds(30, 320, 50, 50);
        btnfordigit5.setBounds(90, 320, 50, 50);
        btnfordigit6.setBounds(150, 320, 50, 50);
        btnforminus.setBounds(210, 320, 50, 50);
        btnfordigit7.setBounds(30, 240, 50, 50);
        btnfordigit8.setBounds(90, 240, 50, 50);
        btnfordigit9.setBounds(150, 240, 50, 50);
        btnformulti.setBounds(210, 240, 50, 50);
        btnforbksp.setBounds(30, 160, 50, 50);
        btnforc.setBounds(90, 160, 50, 50);
        btnforroot.setBounds(150, 160, 50, 50);
        btnfordivide.setBounds(210, 160, 50, 50);

        frame.add(btnforpoint);
        frame.add(btnfordigit0);
        frame.add(btnfordigit1);
        frame.add(btnforplusminus);
        frame.add(btnforequal);
        frame.add(btnfordigit2);
        frame.add(btnfordigit3);
        frame.add(btnforplus);
        frame.add(btnfordigit4);
        frame.add(btnfordigit5);
        frame.add(btnfordigit6);
        frame.add(btnforminus);
        frame.add(btnfordigit7);
        frame.add(btnfordigit8);
        frame.add(btnfordigit9);
        frame.add(btnformulti);
        frame.add(btnforbksp);
        frame.add(btnforc);
        frame.add(btnforroot);
        frame.add(btnfordivide);

        frame.setLayout(null);
        frame.setVisible(true);

    }

}
