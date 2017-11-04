package calc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.*;

public class Calc  extends JFrame{

    double firstvalue, seconvalue, output;
    String operation;
    private Object math;
    
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific Calculator"); // Creating a frame for calculator with tile "Scientific Calculator"
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);  // Stops prgram execution when close button is clicked

        frame.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/calc/icon.png")).getImage()); // Setting icon for the frame

        frame.setSize(600, 550);   // setting frame size 600x600px
        frame.setResizable(false);  // this prevents resizing windows 

        JMenuBar menubar = new JMenuBar();         // Crating a menubar
        JMenuItem menu = new JMenuItem("Credits");  // adding a menu item in the menubar
        menubar.add(menu);                          // adding created menu item to the menubar
        frame.setJMenuBar(menubar);                 // ading menubar to the frane
        JFrame credits = new JFrame();              // adding a new frame for credits
        credits.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/calc/icon.png")).getImage());  // adding icon to the credit frame
        credits.setTitle("Credits");             // setting title for the credits frame
        credits.setSize(250, 250);               // setting credits frame 250x2500px
        JLabel text = new JLabel("<html>Made by Team Vikings<br>Members<br>Md. Monirul Alom (Team leader) <br> Sheher Jahan Rashni <br> Sadia Afrin Misti <br> Moshiur Rahman Khan <br>K M Salman Hossain</html>", SwingConstants.CENTER);  // create label with text for label
        credits.add(text);   // label added to frame credits

        // if any actions are performed on the menu item this funtion is invoked
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                credits.setVisible(true);            // setting credits frame visible
            }
        });

        
        JTextField result = new JTextField("", 40);             // added text field for showing calcuation
        result.setHorizontalAlignment(SwingConstants.RIGHT);    // text alignment is set to right for the text field

        result.setBounds(20, 20, 550, 40);                    //      public void setBounds(int x,int y,int width,int height)
        frame.add(result);

        // creating buttons
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

        // setting xy co-ordinate , height width for buttons
        // public void setBounds(int x,int y,int width,int height)
        btnforpoint.setBounds(30, 420, 50, 50);
        btnfordigit0.setBounds(90, 420, 50, 50);
        btnforplusminus.setBounds(150, 420, 50, 50);
        btnforequal.setBounds(210, 420, 50, 50);
        btnfordigit1.setBounds(30, 340, 50, 50);
        btnfordigit2.setBounds(90, 340, 50, 50);
        btnfordigit3.setBounds(150, 340, 50, 50);
        btnforplus.setBounds(210, 340, 50, 50);
        btnfordigit4.setBounds(30, 260, 50, 50);
        btnfordigit5.setBounds(90, 260, 50, 50);
        btnfordigit6.setBounds(150, 260, 50, 50);
        btnforminus.setBounds(210, 260, 50, 50);
        btnfordigit7.setBounds(30, 180, 50, 50);
        btnfordigit8.setBounds(90, 180, 50, 50);
        btnfordigit9.setBounds(150, 180, 50, 50);
        btnformulti.setBounds(210, 180, 50, 50);
        btnforbksp.setBounds(30, 100, 50, 50);
        btnforc.setBounds(90, 100, 50, 50);
        btnforroot.setBounds(150, 100, 50, 50);
        btnfordivide.setBounds(210, 100, 50, 50);

        // adding buttons to the frame 
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

        frame.setLayout(null);          // diabling layout manager
        frame.setVisible(true);         // seeting the main frame visible

    }

    private  void btnfordigit1ActionPerformed(ActionEvent evt) {
        String digit;
        digit = result.getLabel() + btnfordigit1.getText();
        result.setText(digit);

    }
}
