import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame {
    double value=0;
    double Result=0;
    int Operator=45;
    int Dividend=0;
    double Divisor=0;

    //Panels
    public JPanel txtField, btnNumbers;

    //CLASS DECALRATION
    JTextField TextField;
    JButton One;
    JButton Two;
    JButton Three;
    JButton Four;
    JButton Five;
    JButton Six;
    JButton Seven;
    JButton Eight;
    JButton Nine;
    JButton Zero;
    JButton Enter;
    JButton Plus;
    JButton Minus;
    JButton Product;
    JButton Division;
    JButton Clear;

    //EVENT HANDLER DECLARATION
    OneEventHandler OEH;
    TwoEventHandler TEH;
    ThreeEventHandler ThEH;
    FourEventHandler FEH;
    FiveEventHandler FiEH;
    SixEventHandler SiEH;
    SevenEventHandler SeEH;
    EightEventHandler EEH;
    NineEventHandler NEH;
    ZeroEventHandler ZEH;
    EnterEventHandler EnEH;
    ClearEventHandler ExEH;
    PlusEventHandler PEH;
    MinusEventHandler MEH;
    ProductEventHandler PrEH;
    DivisionEventHandler DEH;

    Calculator() {

        //CLASS INSTANTIATION
        TextField = new JTextField(40);
        Zero = new JButton("0");
        One = new JButton("1");
        Two = new JButton("2");
        Three = new JButton("3");
        Four = new JButton("4");
        Five = new JButton("5");
        Six = new JButton("6");
        Seven = new JButton("7");
        Eight = new JButton("8");
        Nine = new JButton("9");
        Plus=new JButton("+");
        Minus=new JButton("-");
        Product=new JButton("*");
        Division=new JButton("/");
        Enter = new JButton("=");
        Clear = new JButton("Clear");

        //CONTENT PANE CALL
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());

        txtField= new JPanel();
        btnNumbers = new JPanel();
        pane.add(txtField, BorderLayout.NORTH);
        pane.add(btnNumbers, BorderLayout.CENTER);

        txtField.setLayout(new FlowLayout());
        txtField.add(TextField);

        btnNumbers.setLayout(new GridLayout(4, 4));

        btnNumbers.add(Seven);
        btnNumbers.add(Eight);
        btnNumbers.add(Nine);
        btnNumbers.add(Plus);

        btnNumbers.add(Four);
        btnNumbers.add(Five);
        btnNumbers.add(Six);
        btnNumbers.add(Minus);

        btnNumbers.add(One);
        btnNumbers.add(Two);
        btnNumbers.add(Three);
        btnNumbers.add(Product);

        btnNumbers.add(Zero);
        btnNumbers.add(Division);
        btnNumbers.add(Enter);
        btnNumbers.add(Clear);

        //EVENT HANDLER DECLARATION
        OneEventHandler OEH;
        TwoEventHandler TEH;
        ThreeEventHandler ThEH;
        FourEventHandler FEH;
        FiveEventHandler FiEH;
        SixEventHandler SiEH;
        SevenEventHandler SeEH;
        EightEventHandler EEH;
        NineEventHandler NEH;
        ZeroEventHandler ZEH;
        EnterEventHandler EnEH;
        ClearEventHandler ClEH;
        PlusEventHandler PEH;
        MinusEventHandler MEH;
        ProductEventHandler PrEH;
        DivisionEventHandler DEH;

        //EVENT HANDLER INSTANTIATTION
        OEH = new OneEventHandler();
        One.addActionListener(OEH);

        TEH = new TwoEventHandler();
        Two.addActionListener(TEH);

        ThEH = new ThreeEventHandler();
        Three.addActionListener(ThEH);

        FEH = new FourEventHandler();
        Four.addActionListener(FEH);

        FiEH = new FiveEventHandler();
        Five.addActionListener(FiEH);

        SiEH = new SixEventHandler();
        Six.addActionListener(SiEH);

        SeEH = new SevenEventHandler();
        Seven.addActionListener(SeEH);

        EEH = new EightEventHandler();
        Eight.addActionListener(EEH);

        NEH = new NineEventHandler();
        Nine.addActionListener(NEH);

        ZEH = new ZeroEventHandler();
        Zero.addActionListener(ZEH);

        EnEH = new EnterEventHandler();
        Enter.addActionListener(EnEH);

        ExEH = new ClearEventHandler();
        Clear.addActionListener(ExEH);

        PEH=new PlusEventHandler();
        Plus.addActionListener(PEH);

        MEH=new MinusEventHandler();
        Minus.addActionListener(MEH);

        PrEH=new ProductEventHandler();
        Product.addActionListener(PrEH);

        DEH=new DivisionEventHandler();
        Division.addActionListener(DEH);

        //JFRAME INITIALIZER
        setTitle("Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    class ClearEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // System.exit(0);
            Result=0;
            Operator=45;
            TextField.setText("");
        }
    }

    class EnterEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            if (Operator==42)
            {
                Result+=value;
            }
            if (Operator==43)
            {
                Result+=value;
            }
            if (Operator==45)
            {
                Result*=value;
            }
            if (Operator==47)
            {
                Result=value/Divisor;
            }
            value=0;
            TextField.setText(Double.toString(Result));
        }
    }

    class ZeroEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"0");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}

        }
    }

    class OneEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"1");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class TwoEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"2");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class ThreeEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"3");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class FourEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"4");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class FiveEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"5");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class SixEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"6");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class SevenEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"7");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class EightEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"8");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class NineEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"9");
            value = Double.parseDouble(TextField.getText());
            if(Operator==42){value*=-1;}
            if (Operator==45 && Result==0){Result=value;}
            if (Operator==47){Divisor=value;}
        }
    }

    class PlusEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"+");
            Operator=43;
            // Result+=value;
            TextField.setText("");
            value=0;
        }
    }

    class MinusEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"-");
            Operator=42;
            // Result+=value;
            TextField.setText("");
            value=0; }
    }

    class ProductEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"*");
            Operator=45;
            // Result*=value;
            TextField.setText("");
//            value=0;
        }
    }

    class DivisionEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            TextField.setText(TextField.getText()+"/");
            Operator=47;
            Result=value/Divisor;
            TextField.setText("");
            value=0;
        }
    }
}



