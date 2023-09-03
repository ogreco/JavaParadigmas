import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoMySQL {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/tu_basededatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            // Establecer la conexión a la base de datos
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            // Crear una sentencia SQL para la inserción
            String sql = "INSERT INTO tabla_ejemplo (nombre, edad) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            // Establecer los valores para la inserción
            preparedStatement.setString(1, "Ejemplo");
            preparedStatement.setInt(2, 25);

            // Ejecutar la sentencia de inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa. Filas afectadas: " + filasAfectadas);
            } else {
                System.out.println("La inserción no se realizó.");
            }

            // Cerrar la conexión y liberar recursos
            preparedStatement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
