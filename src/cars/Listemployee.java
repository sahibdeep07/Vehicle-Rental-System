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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahib
 */
public class Listemployee extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listemployee
     */
    public Listemployee() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("List Of Employees");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIST OF EMPLOYEES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Address", "DOB", "Qualifications", "Phone No.", "User name", "Joining date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel1)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel(); 
               String q = "select * from employee";
               PreparedStatement myst = myconn.prepareStatement(q);
               ResultSet myres = myst.executeQuery();
                if(myres.next()==true)
                 {
                 do
                 {
                 String n,g,a,d,qu,p,un,j;
                 n=myres.getString("name");
                 g=myres.getString("gender");
                 a=myres.getString("address");
                 d=myres.getString("dob");
                 qu=myres.getString("qualification");
                 p=myres.getString("phone");
                 un=myres.getString("username"); 
                 j=myres.getString("joiningdate");
                 Object myrow[] = {n,g,a,d,qu,p,un,j};

                 mymodel.addRow(myrow);
                 }
                 while(myres.next());

                 }
                 else
                 {
                 JOptionPane.showMessageDialog(rootPane, "No records found");
                 mymodel.setRowCount(0);
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
    
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
