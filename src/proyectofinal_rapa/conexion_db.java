package proyectofinal_rapa;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

    public String[] login(String usuario, String contraseña) {
        conexion();
        String[] datos = new String[3];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE usuario = '" + usuario
                    + "' AND contrasena = '" + contraseña + "'");
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontró el registro.\n Ingrese correctamente los datos");
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = null;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                datos[0] = rs.getString(5);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(6);
            }
            st.close();
            rs.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la base de datos");
        }
        return datos;
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

    public void editarLineasInv(String nombreNuevo, String nombreAnterior, String clave, String autorizacion, String vigencia) {
        conexion();
        try {
            Statement st2 = con.createStatement();
            Statement st1 = con.createStatement();
            boolean checar = checarRelaciones(nombreAnterior);
            if (checar) {
                st1.executeUpdate("UPDATE lineas_investigacion SET clave = '" + clave + "', fecha_auto = '" + autorizacion + "', fecha_vig = '" + vigencia + "' WHERE nombre_linea = '" + nombreAnterior + "'");
            }
            if (!checar) {
                st2.executeUpdate("UPDATE lineas_investigacion SET nombre_linea = '" + nombreNuevo + "', clave = '" + clave + "', fecha_auto = '" + autorizacion + "', fecha_vig = '" + vigencia + "' WHERE nombre_linea = '" + nombreAnterior + "'");
            }
            st1.close();
            st2.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        }
    }

    public void eliminarLineas(String nombreLinea) {
        conexion();
        try {
            st = con.createStatement();
            st.executeUpdate("DELETE FROM lineas_investigacion WHERE nombre_linea = '" + nombreLinea + "'");
            JOptionPane.showMessageDialog(null, "Registros eliminados con exito");
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
        }
    }

    public boolean checarRelaciones(String buscar) throws SQLException {
        conexion();
        boolean retornar = false;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM productos where linea_investigacion = '" + buscar + "'");
            retornar = rs.next();
            st.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar datos en tabla productos. NO se encontraron resultados");
        }
        return retornar;
    }

    public void buscarRegistroLineas(String opcion, String registro, DefaultTableModel tablaModel) {
        conexion();
        try {
            st = con.createStatement();
            switch (opcion) {
                case "CLAVE":
                    rs = st.executeQuery("SELECT * FROM lineas_investigacion WHERE clave = '" + registro + "'");
                    llenarTablaLineasInvInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "NOM. DE LINEA":
                    rs = st.executeQuery("SELECT * FROM lineas_investigacion WHERE nombre_linea = '" + registro + "'");
                    llenarTablaLineasInvInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "FECHA DE AUTORIZACIÓN":
                    rs = st.executeQuery("SELECT * FROM lineas_investigacion WHERE fecha_auto = '" + registro + "'");
                    llenarTablaLineasInvInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "FECHA DE VIGENCIA":
                    rs = st.executeQuery("SELECT * FROM lineas_investigacion WHERE fecha_vig = '" + registro + "'");
                    llenarTablaLineasInvInstruccionesEspeciales(tablaModel, rs);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una de las opciones.");
            }
            st.close();
            rs.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void llenarTablaLineasInvInstruccionesEspeciales(DefaultTableModel tabla, ResultSet instruccion) {
        try {

            rs = instruccion;
            int filas = tabla.getRowCount();
            System.out.println(filas);
            for (int i = 1; i <= filas; i++) {
                System.out.println("limpiando filas");
                tabla.removeRow(0);
            }
            while (rs.next()) {
                System.out.println("agregando ");
                tabla.addRow(new Object[]{rs.getString("nombre_linea"), rs.getString("clave"),
                    rs.getDate("fecha_auto"), rs.getDate("fecha_vig")});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
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

    public void llenarTablaDocentes(DefaultTableModel tabla) {
        conexion();
        try {
            System.out.println("entre al try");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE puesto = 'Docente'");
            int filas = tabla.getRowCount();
            System.out.println(filas);
            for (int i = 1; i <= filas; i++) {
                System.out.println("Limpiando tabla");
                tabla.removeRow(0);
            }
            while (rs.next()) {
                System.out.println("llenando tabla");
                tabla.addRow(new Object[]{rs.getString("usuario"), rs.getString("contrasena"),
                    rs.getString("nombres"), rs.getString("apellidos"), rs.getString("departamento")});
            }
            System.out.println("sali de llenar tabla");
            st.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void buscarRegistroDocentes(String opcion, String registro, DefaultTableModel tablaModel) {
        conexion();
        try {
            st = con.createStatement();
            switch (opcion) {
                case "NOMBRE(S)":
                    rs = st.executeQuery("SELECT * FROM usuarios WHERE puesto = 'Docente' AND nombres like '%" + registro + "%'");
                    llenarTablaDocentesInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "APELLIDOS":
                    rs = st.executeQuery("SELECT * FROM usuarios WHERE puesto = 'Docente' AND apellidos like '%" + registro + "%'");
                    llenarTablaDocentesInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "USUARIO":
                    rs = st.executeQuery("SELECT * FROM usuarios WHERE puesto = 'Docente' AND usuario like '%" + registro + "%'");
                    llenarTablaDocentesInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "DEPARTAMENTO":
                    rs = st.executeQuery("SELECT * FROM usuarios WHERE puesto = 'Docente' AND departamento = '" + registro + "'");
                    llenarTablaDocentesInstruccionesEspeciales(tablaModel, rs);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una de las opciones.");
            }
            st.close();
            rs.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void llenarTablaDocentesInstruccionesEspeciales(DefaultTableModel tabla, ResultSet instruccion) {
        try {
            rs = instruccion;
            int filas = tabla.getRowCount();
            System.out.println(filas);
            for (int i = 1; i <= filas; i++) {
                System.out.println("limpiando filas");
                tabla.removeRow(0);
            }
            while (rs.next()) {
                System.out.println("llenando tabla");
                tabla.addRow(new Object[]{rs.getString("usuario"), rs.getString("contrasena"),
                    rs.getString("nombres"), rs.getString("apellidos"), rs.getString("departamento")});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void editarDocentes(String usuarioNuevo, String usuarioAnterior, String contraseña, String nombres, String apellidos, String departamento) {
        conexion();
        try {
            st = con.createStatement();
            st.executeUpdate("UPDATE usuarios SET usuario = '" + usuarioNuevo + "', contrasena = '" + contraseña + "', nombres = '" + nombres + "', apellidos = '"
                    + apellidos + "', departamento = '" + departamento + "' WHERE usuario = '" + usuarioAnterior + "'");
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        }
    }

    public void eliminarDocentes(String usuario) {
        conexion();
        try {
            st = con.createStatement();
            st.executeUpdate("DELETE FROM usuarios WHERE puesto = 'Docente' AND usuario = '" + usuario + "'");
            JOptionPane.showMessageDialog(null, "Registros eliminados con exito");
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
        }
    }

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="PRODUCTOS - SOURCE"> 
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
                System.out.println("dentro del while");
                tabla.addRow(new Object[]{rs.getString("linea_investigacion"), rs.getString("tipo_producto"),
                    rs.getString("nombre_producto"), rs.getArray("colaboradores"), rs.getString("nivel"), rs.getDate("fecha_registro"), rs.getString("estatus")});
            }
            st.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void registrarProductos(String linea_inv, String tipo_producto, String nombre_producto, String[] colaboradores, String nivel, String fecha_reg, String estatus,String departamento) {
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
                    + "','" + estatus + "','"+departamento+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro completado");
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la tabla. Por favor de checar los datos ingresados");
        }
    }

    public void editarProductos(String nombre_actual, String linea_inv, String tipo_producto, String nombre_producto, String[] colaboradores, String nivel, String fecha_reg, String estatus) {
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
            String sql = "UPDATE productos SET linea_investigacion = '" + linea_inv + "',tipo_producto = '"
                    + tipo_producto + "',nombre_producto = '" + nombre_producto + "', colaboradores = '"
                    + colabConcatenado + "',nivel = '" + nivel + "',fecha_registro = '" + fecha_reg
                    + "',estatus = '" + estatus + "' WHERE nombre_producto = '" + nombre_actual + "';";
            System.out.println(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro completado");
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la tabla. Por favor de checar los datos ingresados");
        }
    }

    public String[] rellenarComboLineas() {
        conexion();
        ArrayList lineas = new ArrayList();
        try {
            st = con.createStatement();
            String sql = "select nombre_linea from lineas_investigacion";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                lineas.add(rs.getString("nombre_linea"));
            }
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener las líneas de innvestigacion");
        }
        String[] lineasinv = new String[lineas.size()];
        for (int i = 0; i < lineasinv.length; i++) {
            lineasinv[i] = (String) lineas.get(i);
        }
        return lineasinv;
    }

    public String[] rellenarComboColaboradores() {
        conexion();
        ArrayList<String> docentes = new ArrayList();
        try {
            st = con.createStatement();
            String sql = "select * from usuarios where puesto = 'Docente'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                docentes.add(rs.getString("nombres"));
            }
            st.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los colaboradores");
        }
        String[] colab = new String[docentes.size()];
        for (int i = 0; i < colab.length; i++) {
            colab[i] = docentes.get(i);
        }
        return colab;
    }

    public void buscarRegistroProductos(String opcion, String registro, DefaultTableModel tablaModel) {
        conexion();
        try {
            st = con.createStatement();
            switch (opcion) {
                case "LINEA":
                    rs = st.executeQuery("SELECT * FROM productos WHERE linea_investigacion = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "TIPO":
                    rs = st.executeQuery("SELECT * FROM productos WHERE tipo_producto = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "NOMBRE":
                    rs = st.executeQuery("SELECT * FROM productos WHERE nombre_producto = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "NIVEL":
                    rs = st.executeQuery("SELECT * FROM productos WHERE nivel = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "FECHA":
                    rs = st.executeQuery("SELECT * FROM productos WHERE fecha_registro = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                case "ESTATUS":
                    rs = st.executeQuery("SELECT * FROM productos WHERE estatus = '" + registro + "'");
                    llenarTablaProductosInstruccionesEspeciales(tablaModel, rs);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una de las opciones.");
            }
            st.close();
            rs.close();
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }

    public void llenarTablaProductosInstruccionesEspeciales(DefaultTableModel tabla, ResultSet instruccion) {

        try {

            rs = instruccion;
            int filas = tabla.getRowCount();
            System.out.println(filas);
            for (int i = 1; i <= filas; i++) {
                System.out.println("limpiando filas");
                tabla.removeRow(0);
            }
            while (rs.next()) {
                System.out.println("agregando ");

                tabla.addRow(new Object[]{rs.getString("linea_investigacion"), rs.getString("tipo_producto"), rs.getString("nombre_producto"),
                    rs.getArray("colaboradores"), rs.getString("nivel"), rs.getDate("fecha_registro"), rs.getString("estatus")});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al rellenar tabla");
        }
    }
    
    public void eliminarProductos(String nombreProducto,String linea_inv) {
        conexion();
        try {
            st = con.createStatement();
            String sql = "DELETE FROM productos WHERE linea_investigacion = '" + linea_inv + "' AND nombre_producto = '"
            +nombreProducto+"';";
            System.out.println(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos");
        }
    }
    // </editor-fold>

    public static void main(String[] args) {
        //registrarUsuarios("esto", "1234", "es", "una", "secretario", "prueba");
        //registrarLineas("esto es", "12345", "10-09-2000", "09-10-9000");
        //String[] ola= {"prueba","uno"};
        //registrarProductos("esto es", "una", "prueba", ola, "medio", "09-09-2000", "hola");
        //login("esto", "123");

    }
}
