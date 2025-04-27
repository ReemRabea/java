import javax.swing.*;
import java.awt.*;

public class FORMM extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JTextField pfPassword;
    private JButton btnregister;
    private JButton btncencel;
    private JTextField pfConfirmPassword;
    private JPanel registerPanel;

    public FORMM( JFrame parent){
        super(parent);
        setTitle("create a new account");
        setContentPane(registerPanel);
        setMaximumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
    public static void main(String[]args){
        FORMM myForm = new FORMM( null);
    }
}

