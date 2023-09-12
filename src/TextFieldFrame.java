
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class TextFieldFrame extends JFrame{
    
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JTextField textField4;
    private JButton boton1;
    
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        
        etiqueta1 = new JLabel("numero a sacar factorial:");
        textField1 = new JTextField(10);
        add(etiqueta1);
        add(textField1);// add textField1 to JFrame
// construct textfield with default text
        etiqueta2 = new JLabel("Calcular exponencial:");
        textField2 = new JTextField(10);
        add(etiqueta2);
        add(textField2);// add textField1 to JFrame
// construct textfield with default text and 21 columns
        etiqueta3 = new JLabel("Calcular exponencial x, ingrese x");
        textField3 = new JTextField(5);
        etiqueta4 = new JLabel("Ingrese la cantidad de veces que se repetirá");
        textField4 = new JTextField(5);
        add(etiqueta3);
        add(textField3);
        add(etiqueta4);
        add(textField4);
        
        boton1 = new JButton("calcular");
        add(boton1);

        TextFieldHandler handler = new TextFieldHandler();
        boton1.addActionListener(handler);
    }
    private class TextFieldHandler implements ActionListener{
// process textfield events
        @Override
    public void actionPerformed(ActionEvent event){
        int fact = Integer.parseInt(textField1.getText());
        Metodos metodos = new Metodos();
        int resfac = metodos.factorial(fact);
        
        double cons = Double.parseDouble(textField2.getText());
        double resltcons = metodos.constante(cons);
        
        double x = Double.parseDouble(textField3.getText());
        int veces = Integer.parseInt(textField4.getText());
        double resltExp = metodos.expX(x, veces);
        
        JOptionPane.showInternalMessageDialog(null, "El factorial es: " + resfac + "\n  El exponencial es: "+ resltcons + "\n El exponencial x es: " + resltExp, "Resultados", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
