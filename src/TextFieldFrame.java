
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class TextFieldFrame extends JFrame{
    
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private final JTextField textField1; // text field with set size
    private final JTextField textField2; // text field with text
    private final JTextField textField3; // text field with text and size
    private JButton boton1;
    private JButton boton2;
    
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
// construct textfield with 10 columns
        etiqueta1 = new JLabel("numero a sacar factorial:");
        textField1 = new JTextField(5);
        boton1 = new JButton();
        add(etiqueta1);
        add(textField1);// add textField1 to JFrame
        add(boton1);
// construct textfield with default text
        etiqueta2 = new JLabel(":");
        textField2 = new JTextField(5);
        boton2 = new JButton();
        add(etiqueta2);
        add(textField2);// add textField1 to JFrame
        add(boton2);
// construct textfield with default text and 21 columns
        textField3 = new JTextField(5);
        add(textField3); // add textField3 to JFrame
// construct passwordfield with default text

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener{
// process textfield events
        @Override
    public void actionPerformed(ActionEvent event){
        String string = "";
// user pressed Enter in JTextField textField1
        if (event.getSource() == textField1)
        string = String.format("textField1: %s",
        event.getActionCommand());
// user pressed Enter in JTextField textField2
        else if (event.getSource() == textField2)
        string = String.format("textField2: %s",
        event.getActionCommand());
// user pressed Enter in JTextField textField3
        else if (event.getSource() == textField3)
        string = String.format("textField3: %s",
        event.getActionCommand());

// display JTextField content
        JOptionPane.showMessageDialog(null, string);
        }
    }
}
