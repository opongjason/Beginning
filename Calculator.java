import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calculator extends JFrame {
        String string;
        int Operator=0;
        int result=0;
        String Result;
        int Operand1=0;
        int Operand2=0;
        String Substring1=null;
        String Substring2=null;
        char character1='0';

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
    JButton Exit;

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
    ExitEventHandler ExEH;
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
        Exit = new JButton("Exit");

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
        btnNumbers.add(Exit);

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
    ExitEventHandler ExEH;
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

        ExEH = new ExitEventHandler();
        Exit.addActionListener(ExEH);

        PEH=new PlusEventHandler();
        Plus.addActionListener(PEH);

        MEH=new MinusEventHandler();
        Minus.addActionListener(MEH);

        PrEH=new ProductEventHandler();
        Product.addActionListener(PrEH);
        
        DEH=new DivisionEventHandler();
        Division.addActionListener(DEH);

        //JFRAME INITIALIZER
        setTitle("Integer-only* Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    class ExitEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class EnterEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string=TextField.getText();
            if(string.charAt(1)==43||string.charAt(1)==45||string.charAt(1)==42||string.charAt(1)==47)
        {
            Operator=string.charAt(1);
            character1=string.charAt(0);
            Operand1=Character.getNumericValue(character1);
            Substring2=string.substring(2,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
         else if(string.charAt(2)==43||string.charAt(2)==45||string.charAt(2)==42||string.charAt(2)==47)
        {
            Operator=string.charAt(2);
             Substring1=string.substring(0,2);
             Operand1=Integer.parseInt(Substring1);
             Substring2=string.substring(3,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(3)==43||string.charAt(3)==45||string.charAt(3)==42||string.charAt(3)==47)
        {
            Operator=string.charAt(3);
            Substring1=string.substring(0,3);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(4,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(4)==43||string.charAt(4)==45||string.charAt(4)==42||string.charAt(4)==47)
        {
            Operator=string.charAt(4);
            Substring1=string.substring(0,4);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(5,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(5)==43||string.charAt(5)==45||string.charAt(5)==42||string.charAt(5)==47)
        {
            Operator=string.charAt(5);
            Substring1=string.substring(0,5);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(6,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(6)==43||string.charAt(6)==45||string.charAt(6)==42||string.charAt(6)==47)
        {
            Operator=string.charAt(6);
            Substring1=string.substring(0,6);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(7,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(7)==43||string.charAt(7)==45||string.charAt(7)==42||string.charAt(7)==47)
        {
            Operator=string.charAt(7);
            Substring1=string.substring(0,7);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(8,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        else if(string.charAt(8)==43||string.charAt(8)==45||string.charAt(8)==42||string.charAt(8)==47)
        {
            Operator=string.charAt(8);
            Substring1=string.substring(0,8);
            Operand1=Integer.parseInt(Substring1);
            Substring2=string.substring(9,string.length());
            Operand2=Integer.parseInt(Substring2);

            if(Operator==43)
            {result=Operand1+Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==45)
            {result=Operand1-Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==42)
            {result=Operand1*Operand2;
            Result=String.valueOf(result);             
            TextField.setText(Result);
            }
            else if(Operator==47)
            {result=Operand1/Operand2;
                Result=String.valueOf(result);
                TextField.setText(Result);
            }
        }
        }
    }

    class ZeroEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"0");

        }
    }

    class OneEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"1");
        }
    }

    class TwoEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"2");
        }
    }

    class ThreeEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"3");
        }
    }

    class FourEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"4");
        }
    }

    class FiveEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"5");
        }
    }

    class SixEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"6");
        }
    }

    class SevenEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"7");
        }
    }

    class EightEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"8");
        }
    }

    class NineEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"9");
        }
    }

    class PlusEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"+");
        }
    }

    class MinusEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"-");
        }
    }

    class ProductEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField.setText(TextField.getText()+"*");
        }
    }

    class DivisionEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            TextField.setText(TextField.getText()+"/");
        }
    }
}


