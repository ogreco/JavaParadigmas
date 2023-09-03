import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectFromMySQL {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/tu_basededatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            String sql = "SELECT id, nombre, edad FROM tabla_ejemplo";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");

                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

            resultSet.close();
            preparedStatement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
