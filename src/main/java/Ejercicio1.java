import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PANEL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar el JPanel
        JPanel panel1 = new JPanel();

        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel1);
        JLabel etiqueta = new JLabel("Hola mundo");

// Agregar la etiqueta al JPanel
        panel1.add(etiqueta);
        frame.pack();
        frame.setVisible(true);
    }
    //Aquí, hemos inicializado el JPanel y lo hemos agregado al contenedor principal, que en este caso es un JFrame.

    //Una vez que hayas relacionado el JPanel con tu código, puedes utilizarlo para agregar otros componentes, establecer diseños, agregar escuchadores de eventos, etc. Puedes consultar la documentación de Java Swing para obtener más información sobre cómo trabajar con componentes Swing en IntelliJ IDEA.







}