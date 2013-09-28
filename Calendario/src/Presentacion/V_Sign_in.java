/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Asignatura.Departamento;
import Datos.Asignatura.Practica;
import Datos.Asignatura.Teorica;
import Negocio.*;
import Datos.Usuario.*;
import Datos.Aula.Aula;
import Datos.Aula.Clase;
import Datos.Aula.Laboratorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GeOrge
 */
public class V_Sign_in extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    Negocio.Usuarios listas = new Negocio.Usuarios();
    ArrayList<Departamento> departamentos = new ArrayList<>();
    ArrayList<Aula> aulas = new ArrayList<>();
    
    public V_Sign_in() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioTipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN IN");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        usuarioTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher", "Coordinator" }));
        usuarioTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTipoActionPerformed(evt);
            }
        });

        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword)
                    .addComponent(txtUser)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(usuarioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(141, 141, 141)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTipoActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName=txtUser.getText();
        String userPassword=txtPassword.getText();
        String user=(String)usuarioTipo.getSelectedItem();
        switch (user){
            case "Coordinator":
                if (!listas.getCoordinador().isEmpty()){
                    for(int i=0; i<listas.getCoordinador().size();i++){
                        if(listas.getCoordinador().get(i).getUsuario().equals(userName)&&listas.getCoordinador().get(i).getContrasena().equals(userPassword)){
                                this.setVisible(false);
                                new V_Coordinador().show();
                    }
                    else{
                        new V_Aviso().show();
                        }
                    }
                }
                else{
                    new V_Aviso_Listas_Vacias().show();
                }
                break;
            case "Student":
                if (!listas.getEstudiante().isEmpty()){
                    for(int i=0; i<listas.getEstudiante().size();i++){
                        if(listas.getEstudiante().get(i).getUsuario().equals(userName)&&listas.getEstudiante().get(i).getContrasena().equals(userPassword)){
                                    this.setVisible(false);
                        }
                        else{
                            new V_Aviso().show();
                        }
                    }
                }
                else{
                    new V_Aviso_Listas_Vacias().show();
                }
                break;
            case "Teacher":
                if(!listas.getProfesor().isEmpty()){
                    for(int i=0; i<listas.getProfesor().size();i++){
                        if(listas.getProfesor().get(i).getUsuario().equals(userName)&&listas.getProfesor().get(i).getContrasena().equals(userPassword)){
                                    this.setVisible(false);
                        }
                        else{
                            new V_Aviso().show();} 
                        } 
                    }
                else {
                    new V_Aviso_Listas_Vacias().show();
                }
                break;
        }
        txtPassword.setText("");
        txtUser.setText("");
        System.out.println(user);
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Coordinador leo = new Coordinador("Leonardo Viquez","lviquez","1234");
        
        listas.getCoordinador().add(leo);
        System.out.println(listas.getCoordinador().get(0).getClass().getSimpleName());
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(V_Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Sign_in().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
    protected void departamentos(){
        departamentos.add(new Departamento("Computacion"));
        departamentos.add(new Departamento("Ciencias y Letras"));
        departamentos.add(new Departamento("Administracion de Empresas"));
    }
    
    protected void aulas() {
        // (String _nombre, int _numero, String _ubicacion, int _capacidad, boolean _acondicionado)
        aulas.add(new Clase("Aula 01",1,"Computacion",30,true));
        aulas.add(new Clase("Aula 02",2,"Computacion",30,true));
        aulas.add(new Clase("Aula 03",3,"Computacion",30,true));
        aulas.add(new Clase("Aula 04",4,"Computacion",30,true));
        aulas.add(new Clase("Aula 05",5,"Computacion",30,true));
        aulas.add(new Clase("Aula 06",6,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 07",7,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 08",8,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 09",9,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 10",10,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 11",11,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 12",12,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 13",13,"Ciencias y Letras",30,false));
        aulas.add(new Clase("Aula 14",14,"Ciencias y Letras",30,true));
        aulas.add(new Clase("Aula 15",15,"Ciencias y Letras",30,false));
        
        // (String _nombre, int _numero, String _ubicacion, int _capacidad)
        aulas.add(new Laboratorio("LAIMI",4,"Computacion",30));
        aulas.add(new Laboratorio("Laboratorio 01",1,"Computacion",24));
        aulas.add(new Laboratorio("Laboratorio 02",2,"Computacion",24));
        aulas.add(new Laboratorio("Laboratorio 03",3,"Computacion",24));
    }
    
    protected void asignaturas(){
        //( codigo, String _nombre, int _grupo, int _semestre, int _creditos)
        departamentos.get(0).agregar(new Teorica("CI1400","Fundamentos de Organizacion de Computadoras",50,1,4,"www.algo1.com"));
        departamentos.get(0).agregar(new Teorica("CI1802","Introduccion a la Programacion",50,1,4,"www.algo2.com"));
        departamentos.get(0).agregar(new Practica("CI1803","Taller de Programacion",50,1,4,"Windows xp"));
        departamentos.get(1).agregar(new Practica("CI0202","Ingles Basico",50,1,2,""));
        departamentos.get(1).agregar(new Practica("MA0101","Matematica General",50,1,3,""));
        departamentos.get(1).agregar(new Practica("CI1311","Ingles I para Computacion",50,1,2,""));
        departamentos.get(1).agregar(new Practica("CI1403","Comunicacion Tecnica",50,1,2,""));
        
        departamentos.get(0).agregar(new Teorica("CI2001","Estructura de Datos",50,2,4,"www.algo3.com"));
        departamentos.get(0).agregar(new Practica("CI2101","Programacion Orientada a Objetos",50,2,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI3101","Arquitectura de Computadores",50,2,4,"www.algo4.com"));
        departamentos.get(1).agregar(new Practica("CI1312","Ingles II para Computacion",50,2,2,""));
        departamentos.get(1).agregar(new Practica("MA1404","Calculo",50,2,4,""));
        
        departamentos.get(0).agregar(new Practica("CI3002","Analisis de Algoritmos",50,3,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI4301","Bases de Datos I",50,3,4,"www.algo5.com"));
        departamentos.get(1).agregar(new Practica("CI1313","Ingles III para Computacion",50,3,2,""));
        departamentos.get(1).agregar(new Teorica("CS2101","Ambiente Humano",50,3,2,""));
        departamentos.get(1).agregar(new Practica("MA2405","Algebra Lineal para Computacion",50,3,4,""));
        
        departamentos.get(0).agregar(new Teorica("CI4302","Bases de Datos II",50,4,4,"www.algo6.com"));
        departamentos.get(0).agregar(new Practica("CI4700","Lenguajes de Programacion",50,4,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI5821","Requerimientos de Software",50,4,4,"www.algo7.com"));
        departamentos.get(1).agregar(new Practica("CI1314","Ingles IV para Computacion",50,4,2,""));
        departamentos.get(1).agregar(new Practica("MA2404","Probabilidades",50,4,4,""));
        
        departamentos.get(0).agregar(new Teorica("CI4810","Administracion de Proyectos",50,5,4,"www.algo8.com"));
        departamentos.get(0).agregar(new Practica("CI5701","Compiladores e Interpretes",50,5,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI6821","Diseño de Software de Software",50,5,4,"www.algo9.com"));
        departamentos.get(1).agregar(new Teorica("CS3401","Seminario de Estudios Filosoficos",50,5,2,""));
        departamentos.get(1).agregar(new Practica("MA3405","Estadistica",50,5,4,""));
        
        departamentos.get(0).agregar(new Practica("CI4003","Electiva I",50,6,4,"Windows xp"));
        departamentos.get(0).agregar(new Practica("CI6400","Investigacion de Operaciones",50,6,4,""));
        departamentos.get(0).agregar(new Teorica("CI6600","Principios de Sistemas Operativos",50,6,4,"www.algo10.com"));
        departamentos.get(0).agregar(new Teorica("CI6831","Aseguramiento de la Calidad de Software",50,6,4,"www.algo11.com"));
        departamentos.get(0).agregar(new Teorica("CI7900","Computacion y Sociedad",50,6,2,"www.algo12.com"));
        departamentos.get(1).agregar(new Teorica("CS4402","Seminario de Estudios Costarricenses",50,6,2,""));
        
        departamentos.get(0).agregar(new Practica("CI5001","Electiva II",50,7,4,"Windows xp"));
        departamentos.get(0).agregar(new Teorica("CI6200","Inteligencia Artificial",50,7,4,"www.algo13.com"));
        departamentos.get(0).agregar(new Teorica("CI7602","Redes",50,7,4,"www.algo14.com"));
        departamentos.get(0).agregar(new Practica("CI7841","Proyecto de Ingenieria de Software",50,7,4,"Windows xp"));
        departamentos.get(2).agregar(new Teorica("AE4208","Desarrollo de Emprendedores",50,7,3,"www.algo15.com"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JComboBox usuarioTipo;
    // End of variables declaration//GEN-END:variables
}
