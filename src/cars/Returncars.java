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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahib
 */
public class Returncars extends javax.swing.JInternalFrame {

    /**
     * Creates new form Updatecustomer
     */
    public Returncars() {
        initComponents();
    }
//    void clearfields()
//        {
//            jTextField1.setText(null);
//            jTextField2.setText(null);
//            jTextField3.setText(null);
//            jTextArea1.setText(null);
//            buttonGroup1.clearSelection();
//        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Return Car");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Customer ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Search By ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Search By  Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customerid", "Name", "Phoneno.", "Address", "CarNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Details"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Car Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Model");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Company");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addGap(0, 117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Return Car");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Booking Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Return Date");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               String q = "select * from customer where custmer_id = ?";
               String t;
                PreparedStatement myst = myconn.prepareStatement(q);
                 myst.setString(1, jTextField1.getText());
                 ResultSet myres = myst.executeQuery(); 
                if(myres.next()==true)
                {
                    jTextField2.setText(myres.getString("name"));
                    jTextField3.setText(myres.getString("carnumber"));
                    jTextField6.setText(myres.getString("bookingdate"));
                }
                
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Customer ID Invalid");
                      
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
          try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               String q = "select * from addvehicle where car_no=?";
                PreparedStatement myst = myconn.prepareStatement(q);

                myst = myconn.prepareStatement(q);
                 myst.setString(1, jTextField3.getText());
                ResultSet myres = myst.executeQuery(); 
                if(myres.next()==true)
                {
                    jTextField4.setText(myres.getString("car_name"));
                    jTextField5.setText(myres.getString("comp_name"));
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel(); 
               String q = "select * from customer where name like ?";;
                PreparedStatement myst = myconn.prepareStatement(q);
               myst.setString(1, "%" + jTextField2.getText() + "%");
 
               ResultSet myres = myst.executeQuery();
 
                if(myres.next()==true)
                 {
                 do
                 {
                 String cid,n,p,a,cn;
                 cid=myres.getString("custmer_id");
                 n=myres.getString("name");
                 p=myres.getString("phonenumber");
                 a=myres.getString("address"); 
                 cn=myres.getString("carnumber");

                 Object myrow[] = {cid,n,p,a,cn};

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
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         String un = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
         try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{ 
             String q="select * from customer where custmer_id=?";

             PreparedStatement myst = myconn.prepareStatement(q);

            myst.setString(1, un);

            ResultSet myres = myst.executeQuery();

            if(myres.next()==true)
            {
            jTextField1.setText(myres.getString("custmer_id"));    
            jTextField2.setText(myres.getString("name"));
            jTextField3.setText(myres.getString("carnumber"));
            jTextField6.setText(myres.getString("bookingdate"));
            }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "Username Invalid");
            }
            String on = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
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
            } try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               String q = "select * from addvehicle where car_no=?";
                PreparedStatement myst = myconn.prepareStatement(q);

                myst = myconn.prepareStatement(q);
                 myst.setString(1, jTextField3.getText());
                ResultSet myres = myst.executeQuery(); 
                if(myres.next()==true)
                {
                    jTextField4.setText(myres.getString("car_name"));
                    jTextField5.setText(myres.getString("comp_name"));
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
    

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);
            try{
               String q = "update customer set return_date=? ";
                PreparedStatement myst = myconn.prepareStatement(q);
                SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                String book = myformat.format(jDateChooser2.getDate());
                myst.setString(1, book);
                int count = myst.executeUpdate();
                
                q="update addvehicle set status=? , rented_to=?  where car_no=?";
                myst = myconn.prepareStatement(q);
                myst.setString(1, "unrented");
                myst.setString(2, "_______");
                myst.setString(3, jTextField3.getText());
                myst.executeUpdate();

                if (count == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Car returned successfully");
                }
                else if(count == 0)
                {
                    JOptionPane.showMessageDialog(rootPane , "error");
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

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
