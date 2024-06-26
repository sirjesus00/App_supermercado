/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Logica.cls_empleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author sala104
 */
public class frm_registro extends javax.swing.JFrame {
        LinkedList<cls_empleados> empleados = new LinkedList<>();
    
    public frm_registro() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(720, 650); 
        setTitle("Convocatoria");
        txt_identificacion.requestFocus();
        
        txt_identificacion.addActionListener((ActionEvent e) -> {
            txt_nombre.requestFocus();
        });
        txt_nombre.addActionListener((ActionEvent e) -> {
            txt_apellido.requestFocus();
        });
        txt_apellido.addActionListener((ActionEvent e) -> {
            txt_telefono.requestFocus();
        });
        
        txt_telefono.addActionListener((ActionEvent e) -> {
            txt_correo.requestFocus();
        });
        
        txt_correo.addActionListener((ActionEvent e) -> {
            txt_sexo.requestFocus();
        });
        
        txt_sexo.addActionListener((ActionEvent e) -> {
            txt_perfilPro.requestFocus();
        });
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_sexo = new javax.swing.JTextField();
        txt_identificacion = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_perfilPro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_estudios = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(710, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Identificacion:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Estudios:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Perfil profesional:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Sexo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Telefono:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Correo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(64, 64, 64));
        txt_apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_apellido.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 270, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(64, 64, 64));
        txt_nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_nombre.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 270, -1));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(64, 64, 64));
        txt_telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_telefono.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 270, -1));

        txt_correo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(64, 64, 64));
        txt_correo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_correo.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 270, -1));

        txt_sexo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_sexo.setForeground(new java.awt.Color(64, 64, 64));
        txt_sexo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_sexo.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 270, -1));

        txt_identificacion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_identificacion.setForeground(new java.awt.Color(64, 64, 64));
        txt_identificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(64, 64, 64)));
        txt_identificacion.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txt_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 270, -1));

        btn_registrar.setBackground(new java.awt.Color(115, 2, 2));
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setFocusPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, -1));

        jButton3.setBackground(new java.awt.Color(115, 2, 2));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Nuevo");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, -1, -1));

        jButton1.setBackground(new java.awt.Color(115, 2, 2));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        txt_perfilPro.setColumns(20);
        txt_perfilPro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_perfilPro.setForeground(new java.awt.Color(64, 64, 64));
        txt_perfilPro.setRows(5);
        txt_perfilPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 64, 64)));
        jScrollPane1.setViewportView(txt_perfilPro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 270, -1));

        txt_estudios.setColumns(20);
        txt_estudios.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_estudios.setRows(5);
        txt_estudios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 64, 64)));
        jScrollPane2.setViewportView(txt_estudios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 270, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void fnt_limpiar(){
        txt_identificacion.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
        txt_sexo.setText("");
        txt_perfilPro.setText("");
        txt_estudios.setText("");
        txt_identificacion.requestFocus();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fnt_limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public void fnt_registrar(){
        int existe = 0;
        cls_empleados e1 = new cls_empleados(txt_identificacion.getText(),
                txt_nombre.getText(),
                txt_apellido.getText(), 
                txt_telefono.getText(),
                txt_correo.getText(),
                txt_sexo.getText(),
                txt_perfilPro.getText(),
                txt_estudios.getText());
        
        if(txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_identificacion.getText().isEmpty() ||
           txt_telefono.getText().isEmpty() || txt_correo.getText().isEmpty() || txt_sexo.getText().isEmpty() ||
           txt_perfilPro.getText().isEmpty() || txt_estudios.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(null, "ERROR faltan campos por llenar");
             existe=1;
        }
        
        for (cls_empleados empleado : empleados){
             if(empleado.getIdStr().equals(e1.getIdStr())) {
                 JOptionPane.showMessageDialog(null, "ERROR Empleado ya EXISTENTE");
              existe=1;
             }
        }
             
        if(existe == 0){
               empleados.add(e1);
                 JOptionPane.showMessageDialog(null, "Empleado registrado con exito");
             }
        
        }
    
    
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
            fnt_registrar();
    }//GEN-LAST:event_btn_registrarActionPerformed
    public void fnt_mostrarDatos(){
        int cont = 1;
    for (cls_empleados empleado : empleados){
        
        if(txt_identificacion.getText().equals(empleado.getIdStr())){
                txt_nombre.setText(empleado.getNombreStr());
                txt_apellido.setText(empleado.getApellidoStr());
                txt_telefono.setText(empleado.getNumero_contactoStr());
                txt_correo.setText(empleado.getCorreoStr());
                txt_perfilPro.setText(empleado.getPerfil_profesionalStr());
                txt_estudios.setText(empleado.getEstudios_realizadosStr());
         
         
            }
        }
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fnt_mostrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextArea txt_estudios;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_perfilPro;
    private javax.swing.JTextField txt_sexo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
