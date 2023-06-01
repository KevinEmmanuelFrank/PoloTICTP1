package Ventanas;
import javax.swing.*;

public class ventana extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton aceptarButton;

    private JButton cancelarButton;
    public ventana() {
        // Configuraciones de la ventana
        setTitle("Mi Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();

        // Añadir código para configurar el tamaño y la ubicación de la ventana
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Establecer un tamaño adecuado para la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        aceptarButton.addActionListener(this::JButtonActionPerformed);
        cancelarButton.addActionListener(this::JButton2ActionPerformed);
    }
    private void JButtonActionPerformed(java.awt.event.ActionEvent evt){
        String contras = passwordField1.getText();
        String nombre = textField1.getText();
        if (!(nombre.isEmpty() || contras.isEmpty())) {
            if (nombre.equalsIgnoreCase("Kevin") && contras.equals("java")){
                JOptionPane.showMessageDialog(this, "Bienvenido " + nombre);
            }
            else JOptionPane.showMessageDialog(this, "Por favor, verifique los datos");
        }
        else JOptionPane.showMessageDialog(this, "Error, ingrese algún dato");
    }
    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt){
        textField1.setText(null);
        passwordField1.setText(null);
    }
}
