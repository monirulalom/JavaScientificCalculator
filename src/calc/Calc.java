package calc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.*;

public class Calc {

    static double firstvalue, secondvalue, output;
    static String operator;
    Object math;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Scientific Calculator"); // Creating a frame for calculator with tile "Scientific Calculator"
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);  // Stops prgram execution when close button is clicked

        frame.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/calc/icon.png")).getImage()); // Setting icon for the frame

        frame.setSize(580, 550);   // setting frame size 600x600px
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

        result.setBounds(20, 20, 530, 40);                    //      public void setBounds(int x,int y,int width,int height)
        frame.add(result);

        // creating buttons
        //row 1
        JButton btnforpoint = new JButton(".");
        JButton btnfordigit0 = new JButton("0");
        JButton btnforplusminus = new JButton("±");
        JButton btnforequal = new JButton("=");
        JButton btnforx3 = new JButton("x^3");
        JButton btnforbin = new JButton("bin");
        JButton btnforhex = new JButton("hex");
        JButton btnforoct = new JButton("oct");
        
        //row 2
        JButton btnfordigit1 = new JButton("1");
        JButton btnfordigit2 = new JButton("2");
        JButton btnfordigit3 = new JButton("3");
        JButton btnforplus = new JButton("+");
        JButton btnforx2 = new JButton("x^2");
        JButton btnforcos = new JButton("cos");
        JButton btnforcosh = new JButton("cosh");
        JButton btnforacos = new JButton("acos");
        
        
        // row 3
        
        JButton btnfordigit4 = new JButton("4");
        JButton btnfordigit5 = new JButton("5");
        JButton btnfordigit6 = new JButton("6");
        JButton btnforminus = new JButton("-");
        JButton btnforxy = new JButton("x^y");
        JButton btnforsin = new JButton("sin");
        JButton btnforsinh = new JButton("sinh");
        JButton btnforasin = new JButton("asin");
        
        
        
        //row 4
        JButton btnfordigit7 = new JButton("7");
        JButton btnfordigit8 = new JButton("8");
        JButton btnfordigit9 = new JButton("9");
        JButton btnformulti = new JButton("×");
        JButton btnforpi = new JButton("π");
        JButton btnfortan = new JButton("tan");
        JButton btnfortanh = new JButton("tanh");
        JButton btnforatan = new JButton("atan");
        
        
        // row 5
        JButton btnforbksp = new JButton("←");
        JButton btnforc = new JButton("C");
        JButton btnforroot = new JButton("√");
        JButton btnfordivide = new JButton("÷");
        JButton btnforlog = new JButton("log");
        JButton btnforln = new JButton("ln");
        JButton btnforexp = new JButton("exp");
        JButton btnformod = new JButton("mod");

        // setting xy co-ordinate , height width for buttons
        // public void setBounds(int x,int y,int width,int height)
        // row 1
        btnforpoint.setBounds(30, 420, 50, 50);
        btnfordigit0.setBounds(90, 420, 50, 50);
        btnforplusminus.setBounds(150, 420, 50, 50);
        btnforequal.setBounds(210, 420, 50, 50);
        btnforx3.setBounds(270,420,65,50);
        btnforbin.setBounds(340,420,65,50);
        btnforhex.setBounds(410,420,65,50);
        btnforoct.setBounds(480,420,65,50);
        
        // row 2
        btnfordigit1.setBounds(30, 340, 50, 50);
        btnfordigit2.setBounds(90, 340, 50, 50);
        btnfordigit3.setBounds(150, 340, 50, 50);
        btnforplus.setBounds(210, 340, 50, 50);
        btnforx2.setBounds(270,340,65,50);
        btnforsin.setBounds(340,340,65,50);
        btnforsinh.setBounds(410,340,65,50);
        btnforasin.setBounds(480,340,65,50);
        //row 3
        btnfordigit4.setBounds(30, 260, 50, 50);
        btnfordigit5.setBounds(90, 260, 50, 50);
        btnfordigit6.setBounds(150, 260, 50, 50);
        btnforminus.setBounds(210, 260, 50, 50);
        btnforxy.setBounds(270,260,65,50);
        btnforcos.setBounds(340,260,65,50);
        btnforcosh.setBounds(410,260,65,50);
        btnforacos.setBounds(480,260,65,50);
        
        
        //row4
        btnfordigit7.setBounds(30, 180, 50, 50);
        btnfordigit8.setBounds(90, 180, 50, 50);
        btnfordigit9.setBounds(150, 180, 50, 50);
        btnformulti.setBounds(210, 180, 50, 50);
        btnforpi.setBounds(270,180,65,50);
        btnfortan.setBounds(340,180,65,50);
        btnfortanh.setBounds(410,180,65,50);
        btnforatan.setBounds(480,180,65,50);
        
        
        // row 5 
        btnforbksp.setBounds(30, 100, 50, 50);
        btnforc.setBounds(90, 100, 50, 50);
        btnforroot.setBounds(150, 100, 50, 50);
        btnfordivide.setBounds(210, 100, 50, 50);
        btnforlog.setBounds(270,100,65,50);
        btnforln.setBounds(340,100,65,50);
        btnforexp.setBounds(410,100,65,50);
        btnformod.setBounds(480,100,65,50);
        // adding buttons to the frame 
        frame.add(btnforpoint);
        frame.add(btnfordigit0);
        frame.add(btnfordigit1);
        frame.add(btnforplusminus);
        frame.add(btnforequal);
        frame.add(btnforx3);
        frame.add(btnforbin);
        frame.add(btnforhex);
        frame.add(btnforoct);
        frame.add(btnfordigit2);
        frame.add(btnfordigit3);
        frame.add(btnforplus);
        frame.add(btnforx2);
        frame.add(btnforsin);
        frame.add(btnforsinh);
        frame.add(btnforasin);
        frame.add(btnfordigit4);
        frame.add(btnfordigit5);
        frame.add(btnfordigit6);
        frame.add(btnforminus);
        frame.add(btnforxy);
        frame.add(btnforcos);
        frame.add(btnforcosh);
        frame.add(btnforacos);
        frame.add(btnfordigit7);
        frame.add(btnfordigit8);
        frame.add(btnfordigit9);
        frame.add(btnformulti);
        frame.add(btnforpi);
        frame.add(btnfortan);
        frame.add(btnfortanh);
        frame.add(btnforatan);
        frame.add(btnforbksp);
        frame.add(btnforc);
        frame.add(btnforroot);
        frame.add(btnfordivide);
        frame.add(btnforlog);
        frame.add(btnforln);
        frame.add(btnforexp);
        frame.add(btnformod);
        

        // Action listeners
        btnfordigit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit1.getText();
                result.setText(displaytext);

            }
        });
        btnfordigit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit2.getText();
                result.setText(displaytext);

            }
        });
        btnfordigit3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit3.getText();
                result.setText(displaytext);

            }
        });
        btnfordigit4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit4.getText();
                result.setText(displaytext);

            }
        });
        btnfordigit5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit5.getText();
                result.setText(displaytext);

            }
        });
        btnfordigit6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit6.getText();
                result.setText(displaytext);

            }
        });

        btnfordigit7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit7.getText();
                result.setText(displaytext);

            }
        });

        btnfordigit8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit8.getText();
                result.setText(displaytext);

            }
        });

        btnfordigit9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit9.getText();
                result.setText(displaytext);

            }
        });

        btnfordigit0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String displaytext = result.getText() + btnfordigit0.getText();
                result.setText(displaytext);

            }
        });

        btnforpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (!result.getText().contains(".")) {
                    String displaytext = result.getText() + btnforpoint.getText();
                    result.setText(displaytext);
                }

            }
        });

        btnforroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                double root = Math.sqrt(Double.parseDouble(String.valueOf(result.getText())));
                result.setText(String.valueOf(root));
            }
        });

        btnforc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                result.setText("");
            }
        });

        btnforbksp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String bksp = null;
                if (result.getText().length() > 0) {

                    StringBuilder strB = new StringBuilder(result.getText());
                    strB.deleteCharAt(result.getText().length() - 1);
                    bksp = strB.toString();
                    result.setText(bksp);

                }

            }
        });

        btnforplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                firstvalue = Double.parseDouble(result.getText());
                result.setText("");
                operator = "+";

            }
        });
        btnforminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                firstvalue = Double.parseDouble(result.getText());
                result.setText("");
                operator = "-";

            }
        });
        btnformulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                firstvalue = Double.parseDouble(result.getText());
                result.setText("");
                operator = "×";

            }
        });
        btnfordivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                firstvalue = Double.parseDouble(result.getText());
                result.setText("");
                operator = "÷";

            }
        });
        
        btnforxy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                firstvalue = Double.parseDouble(result.getText());
                result.setText("");
                operator = "x^y";

            }
        });
        btnforexp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                double exp = Double.parseDouble(result.getText());
                exp = Math.pow(10, exp);

            }
        });

        btnforequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String ans;

                secondvalue = Double.parseDouble(result.getText());

                if (operator == "+") {
                    double sum = firstvalue + secondvalue;
                    ans = String.format("%.2f", sum);
                    result.setText(ans);
                } else if (operator == "-") {
                    double sub = firstvalue - secondvalue;
                    ans = String.format("%.2f", sub);
                    result.setText(ans);
                } else if (operator == "×") {
                    double mul = firstvalue * secondvalue;
                    ans = String.format("%.2f", mul);
                    result.setText(ans);
                } else if (operator == "÷") {
                    double div = firstvalue / secondvalue;
                    ans = String.format("%.2f", div);
                    result.setText(ans);
                }else if (operator == "x^y") {
                    
                    //System.out.println("firstvalue" + firstvalue + "second" + secondvalue );
                    double pow = Math.pow(firstvalue , secondvalue) ;
                    ans = Double.toString(pow);
                    result.setText(ans);
                }

            }
        });
         btnforx2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               double x = Double.parseDouble(result.getText());
                x = x*x;
                result.setText(Double.toString(x));
                

            }
        });
         
         btnforx3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               double x = Double.parseDouble(result.getText());
                x = x*x*x;
                result.setText(Double.toString(x));
                

            }
        });
         
         btnforx3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               double x = Double.parseDouble(result.getText());
                x = x*x*x;
                result.setText(Double.toString(x));
                

            }
        });

        frame.setLayout(null);          // diabling flow layout
        frame.setVisible(true);         // seeting the main frame visible

    }
}
