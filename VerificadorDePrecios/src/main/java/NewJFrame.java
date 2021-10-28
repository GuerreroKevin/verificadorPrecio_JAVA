
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Kevin Guerrero
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private String codigo = "";
    private int width;
    int segundos = 0;
    int tiempo = 5;

    public NewJFrame() throws InterruptedException {

        initComponents();
        pantallaPrincipal();
    }

    public void start() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                //Do stuff
                try {
                    pantallaPrincipal();
                    t.cancel();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } 
                t.cancel();
            }
        }, 5000, 5000);
    }

    public void pantallaPrincipal() throws InterruptedException {

        this.getContentPane().setBackground(new Color(213, 232, 212));
        width = Toolkit.getDefaultToolkit().getScreenSize().width;

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        this.setLayout(null);

        logo.setVisible(true);
        logo.setSize(115, 104);
        logo.setIcon(new ImageIcon(new ImageIcon("img\\placeholder.png").getImage().getScaledInstance(115, 104, Image.SCALE_DEFAULT)));
        logo.setLocation(this.getWidth() / 2 - logo.getWidth() / 2, this.getHeight() / 4 - logo.getHeight() + 50);

        imgProduct.setSize(146, 132);
        imgProduct.setIcon(new ImageIcon(new ImageIcon("img/barcode-scan.gif").getImage().getScaledInstance(146, 132, Image.SCALE_DEFAULT)));
        imgProduct.setLocation(this.getWidth() / 2 - imgProduct.getWidth() / 2, this.getHeight() / 2 + logo.getHeight() - 30);

        texto.setSize(188, 37);
        texto.setText("Bienvenido");
        texto.setLocation(this.getWidth() / 2 - texto.getWidth() / 2, 20);

        infProduct.setSize(465, 29);
        infProduct.setLocation(this.getWidth() / 2 - infProduct.getWidth() / 2, this.getHeight() / 2);
        infProduct.setText("Pase el producto por el escaner por favor");

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        imgProduct = new javax.swing.JLabel();
        infProduct = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 232, 212));
        setUndecorated(true);
        setSize(Toolkit. getDefaultToolkit(). getScreenSize().width, Toolkit. getDefaultToolkit(). getScreenSize().height);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(305, 165));

        imgProduct.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        imgProduct.setMaximumSize(new java.awt.Dimension(1000, 1000));
        imgProduct.setPreferredSize(new java.awt.Dimension(120, 120));

        infProduct.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infProduct.setText("jLabel5");

        texto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        texto.setText("Busqueda exitosa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(imgProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imgProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(infProduct)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(texto)
                        .addGap(218, 218, 218))))
        );

        infProduct.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() != 10) {
            codigo += evt.getKeyChar();
        } else {
            try {
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verificador_de_precios", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT producto_nombre, producto_precio, producto_stock, producto_imagen FROM productos WHERE producto_codigo = " + codigo);

                if (rs.next()) {

                    logo.setVisible(false);
                    try {
                        String path = rs.getString(4);
                        URL url = new URL(path);
                        BufferedImage image = ImageIO.read(url);

                        imgProduct.setSize(200, 200);
                        imgProduct.setIcon(new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        imgProduct.setLocation((this.getWidth() / 4) - (imgProduct.getWidth() / 2), (this.getHeight() / 2) - imgProduct.getHeight() / 2 + 30);

                    } catch (Exception exp) {

                        imgProduct.setSize(200, 200);
                        imgProduct.setIcon(new ImageIcon(new ImageIcon("img\\placeholder.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        imgProduct.setLocation((this.getWidth() / 4) - (imgProduct.getWidth() / 2), (this.getHeight() / 2) - imgProduct.getHeight() / 2 + 30);

                    }
                    texto.setSize(214, 38);
                    texto.setText("Busqueda exitosa");

                    infProduct.setSize(width - 200, 150);         //width = ancho     height = alto
                    infProduct.setLocation(this.getWidth() / 2, this.getHeight() / 4 + texto.getHeight());
                    infProduct.setText("<html>Nombre: " + rs.getString(1) + "<br>Precio: " + rs.getString(2) + "<br>Cantidad en almacén: " + rs.getString(3));

                    start();

                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado, llame a personal autorizado");
                }

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e.toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            codigo = "";
        }

    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgProduct;
    private javax.swing.JLabel infProduct;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
