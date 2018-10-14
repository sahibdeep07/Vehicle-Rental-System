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
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  try
 {
                 Connection myconn = DriverManager.getConnection(url,dbuser,dbpass);

 try
 {
 String q="select * from employee";

 PreparedStatement myst = myconn.prepareStatement(q);
 ResultSet myres = myst.executeQuery();
 try 
 {
 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } 
 catch (Exception ex) 
 {
 JOptionPane.showMessageDialog(null, "Error while setting theme");
 }
 
 if(myres.next()==true)
 {
 Login obj = new Login();
 obj.setVisible(true);
 }
 else
 {
  Admin obj = new Admin ();
  obj.setVisible(true);
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
 }
 finally
 {
 myconn.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error in connection " + e.getMessage());
 }
 }
    }
    

