/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import static cars.vars.dbpass;
import static cars.vars.dbuser;
import static cars.vars.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahib
 */
public class Addcompany extends javax.swing.JInternalFrame {

    /**
     * Creates new form Addcompany
     */
    public Addcompany() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Add Car Company");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("List of Added Companies");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Companies" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Company Name");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add Company");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (checkcomp()==true){           
        try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               String q = "insert into addcomp(comp_name) values(?)";
                PreparedStatement myst = myconn.prepareStatement(q);
                myst.setString(1, jTextField1.getText());
                int count = myst.executeUpdate();
                if (count == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Company added succesfully");
                   
                }
                else if(count == 0)
                {
                    JOptionPane.showMessageDialog(rootPane , "Company not added ");
                }
            } catch(Exception e)
            {
              JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
            }
              finally
            {
              myconn.close();
            }
             
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());

        }
     }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        fetchcomp();
    }//GEN-LAST:event_formInternalFrameOpened
    void fetchcomp()
        {
        try
        {
           Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);             
        try
        {

        String q="select * from addcomp";

        PreparedStatement myst = myconn.prepareStatement(q);

        ResultSet myres = myst.executeQuery();
        if(myres.next()==true)
        {
        do
        {
        jComboBox1.addItem(myres.getString("comp_name"));
        }
        while(myres.next());

        }
        else
        {
        jComboBox1.removeAllItems();
        jComboBox1.addItem("No Comapnies");
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        finally
        {
        myconn.close();
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
        }
     }
    boolean checkcomp(){
       boolean userexist =false;
       try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
                String q="select * from addcomp where comp_name=?";    
                PreparedStatement myst = myconn.prepareStatement(q);
                myst.setString(1, jTextField1.getText());
                ResultSet myres = myst.executeQuery();
                if(myres.next()==true)
                {
                  JOptionPane.showMessageDialog(rootPane, "Comapny already added");
                  userexist=false;
                }
                else
                {
                   userexist=true;
                }

               }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
            }
            finally
            {
            myconn.close();
            }
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
            }   
        return userexist;
       
   }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
