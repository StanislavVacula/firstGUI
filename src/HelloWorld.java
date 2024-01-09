import javax.swing.*;


public class HelloWorld extends JFrame  {
    private JPanel panelMain;
    private JTextField textName;
    private JButton clickMeButton;

    public HelloWorld() {
        setContentPane(panelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Window");
        initComponents();
        pack();
    }
    private void initComponents(){
        clickMeButton.addActionListener(e -> provedeniAkce());
    }
    private void provedeniAkce(){
        JOptionPane.showMessageDialog(this, "Ahoj "+textName.getText());
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.setVisible(true);
    }
}
