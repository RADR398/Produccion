/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producción;


import Clases.Fondo;
import Clases.NewHibernateUtil;
import Menu.PlanAgregado;
import Menu.ProductoInternal;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author panda
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private GraphicsDevice screen;
    private boolean flag = true;
    ProductoInternal p;
   
    
    
    public VentanaPrincipal() {
        initComponents();
        init();
    }

    public final void init(){
        
        setExtendedState(MAXIMIZED_BOTH);
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        screen = environment.getDefaultScreenDevice();
        screen.setFullScreenWindow(this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        screenlbl = new javax.swing.JLabel();
        cerrarlbl = new javax.swing.JLabel();
        minimizelbl = new javax.swing.JLabel();
        fondoInternal = new Fondo();
        jPanel3 = new javax.swing.JPanel();

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06_menu_grid-512_1.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setBackground(new java.awt.Color(51, 53, 62));

        screenlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unfullscreen.png"))); // NOI18N
        screenlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                screenlblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                screenlblMouseEntered(evt);
            }
        });

        cerrarlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/closeIcon.png"))); // NOI18N
        cerrarlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarlblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarlblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarlblMouseEntered(evt);
            }
        });

        minimizelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizeIcon.png"))); // NOI18N
        minimizelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizelblMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizelblMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizelblMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(screenlbl)
                .addGap(0, 0, 0)
                .addComponent(minimizelbl)
                .addGap(0, 0, 0)
                .addComponent(cerrarlbl))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screenlbl)
            .addComponent(cerrarlbl)
            .addComponent(minimizelbl)
        );

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jMenuBar1,java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fondoInternal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fondoInternal, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void screenlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenlblMouseClicked

        if(flag){

            screen.setFullScreenWindow(null);
            flag = false;
            setExtendedState(MAXIMIZED_BOTH);

        }else{

            screen.setFullScreenWindow(this);
            flag = true;

        }

    }//GEN-LAST:event_screenlblMouseClicked

    private void screenlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenlblMouseExited

        if(flag){

            screenlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/unfullscreen.png")));

        }else{

            screenlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/fullscreen.png")));

        }

    }//GEN-LAST:event_screenlblMouseExited

    private void screenlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenlblMouseEntered

        if(flag){

            screenlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/unfullscreen-hover.png")));

        }else{

            screenlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/fullscreen-hover.png")));

        }

    }//GEN-LAST:event_screenlblMouseEntered

    private void cerrarlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarlblMouseClicked

    private void cerrarlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlblMouseExited
        cerrarlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/closeIcon.png")));
    }//GEN-LAST:event_cerrarlblMouseExited

    private void cerrarlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarlblMouseEntered

        cerrarlbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/closeIcon_hover.png")));

    }//GEN-LAST:event_cerrarlblMouseEntered

    private void minimizelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizelblMouseClicked

        minimizelbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/minimizeIcon.png")));
        setExtendedState(ICONIFIED);

    }//GEN-LAST:event_minimizelblMouseClicked

    private void minimizelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizelblMouseExited

        minimizelbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/minimizeIcon.png")));

    }//GEN-LAST:event_minimizelblMouseExited

    private void minimizelblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizelblMouseEntered

        minimizelbl.setIcon(new ImageIcon(getClass().getResource("/Imagenes/minimizeIcon_hover.png")));

    }//GEN-LAST:event_minimizelblMouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        ProductoInternal p = new ProductoInternal();
        p.setVisible(true);
        fondoInternal.add(p);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
       
       
                    UIManager.put("Synthetica.window.decoration", false);
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarlbl;
    public static javax.swing.JDesktopPane fondoInternal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimizelbl;
    private javax.swing.JLabel screenlbl;
    // End of variables declaration//GEN-END:variables
}
