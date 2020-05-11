/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Camilo Gonzàlez Ramos
 * 
 * Esta clase se encarga de realizar la comunicación con la base de datos por default no se tiene un usuario con clave.
 * 
 */

public class Conexion {

  Connection conectar = null;
  
  public Connection conexion(){
      
      try{
          
          Class.forName("com.mysql.jdbc.Driver");
          conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datos", "root", "");
          JOptionPane.showMessageDialog(null, "Conexión Exitosa");
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error de Conexión " + e.getMessage());
      }
      
    return conectar;
  }
    
}
