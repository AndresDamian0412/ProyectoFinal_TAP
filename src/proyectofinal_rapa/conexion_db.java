/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_rapa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class conexion_db {

    public static Connection con = null;
    public static Statement st = null;
    public static ResultSet rs = null;

    public static Connection conexion() {
        String connectString = "jdbc:postgresql://localhost:5432/pruebabd";
        String user = "postgres";
        String password = "bnn0";
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Controlador correcto");
            con = DriverManager.getConnection(connectString, user, password);
            System.out.println("Conexion a la base de datos pruebabd realizada con exito");

        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgresSQL: " + ex);
        } catch (SQLException e) {
            System.out.println("Se ha producido un error en la conexion a la base de datos pruebabd " + e.toString());
        }
        return con;
    }

    public void registrarUsuarios(String usuario, String contraseña, String nombres, String apellidos, String puesto, String departamento) {
        conexion();
        try {
            st = con.createStatement();
            String sql = "INSERT INTO usuarios VALUES('" + usuario + "','" + contraseña + "','" + nombres + "','"
                    + apellidos + "','" + puesto + "','" + departamento + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro completado");
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la tabla. Por favor de checar los datos ingresados");
        }
    }

    public String login(String usuario, String contraseña) {
        conexion();
        String puesto = "";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE usuario = '" + usuario
                    + "' AND contrasena = '" + contraseña + "'");
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontró el registro.\n Ingrese correctamente los datos");
                puesto = "";
            } else {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                puesto = rs.getString(5);
            }
            st.close();
            rs.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la base de datos");
        }
        return puesto;
    }
    //<editor-fold defaultstate="collapsed" desc="LINEAS DE INVESTIGACION - SOURCE"> 
    public void registrarLineas(String nombre_linea, String clave, String fecha_auto, String fecha_vig) {
        conexion();
        try {
            st = con.createStatement();
            String sql = "INSERT INTO lineas_investigacion VALUES('" + nombre_linea + "','" + clave + "','" + fecha_auto
                    + "','" + fecha_vig + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro completado");
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la tabla. Por favor de checar los datos ingresados");
        }
    }
    
    public void editar_eliminarLineas(){
        
    }

    public void llenarTablaLineasInv(DefaultTableModel tabla) {
        conexion();

        try {
            System.out.println("entre al try");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM lineas_investigacion");
            int filas = tabla.getRowCount();
            System.out.println(filas);
            for (int i = 1; i <= filas; i++) {
                System.out.println("Limpiando tabla");
                tabla.removeRow(0);
            }
            while (rs.next()) {
                System.out.println("llenando tabla");
                tabla.addRow(new Object[]{rs.getString("nombre_linea"), rs.getString("clave"),
                    rs.getDate("fecha_auto"), rs.getDate("fecha_vig")});
            }
            System.out.println("sali de llenar tabla");
            st.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }
    // </editor-fold>

    public void llenarTablaProductos(DefaultTableModel tabla) {
        conexion();
        
        try {    
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos");
            int filas = tabla.getRowCount();
            
            for (int i = 1; i <= filas; i++) {
                tabla.removeRow(0);
            }
            while (rs.next()) {
                tabla.addRow(new Object[]{rs.getString("linea_investigacion"), rs.getString("tipo_producto"),
                    rs.getString("nombre_producto"), rs.getString("colaboladores"), rs.getString("nivel"),rs.getDate("fecha_registro"),rs.getString("estatus")});
            }
            st.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al rellenar tabla");
        }
    }

    public void registrarProductos(String linea_inv, String tipo_producto, String nombre_producto, String[] colaboradores, String nivel, String fecha_reg, String estatus) {
        conexion();
        String colabConcatenado = "{";
        if (colaboradores.length > 1) {
            for (int i = 0; i < colaboradores.length; i++) {
                colabConcatenado += colaboradores[i];
                if (i != colaboradores.length - 1) {
                    colabConcatenado += ",";
                }
            }
            colabConcatenado += "}";
        } else if (colaboradores.length == 1) {
            colabConcatenado += colaboradores[0] + "}";
        } else {
            colabConcatenado = null;
        }
        try {
            st = con.createStatement();
            String sql = "INSERT INTO productos VALUES('" + linea_inv + "','" + tipo_producto + "','"
                    + nombre_producto + "','" + colabConcatenado + "','" + nivel + "','" + fecha_reg
                    + "','" + estatus + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro completado");
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la tabla. Por favor de checar los datos ingresados");
        }
    }

    public static void main(String[] args) {
        //registrarUsuarios("esto", "1234", "es", "una", "secretario", "prueba");
        //registrarLineas("esto es", "12345", "10-09-2000", "09-10-9000");
        //String[] ola= {"prueba","uno"};
        //registrarProductos("esto es", "una", "prueba", ola, "medio", "09-09-2000", "hola");
        //login("esto", "123");
    }
}
