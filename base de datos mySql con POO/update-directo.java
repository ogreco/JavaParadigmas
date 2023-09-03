import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateInMySQL {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/tu_basededatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            String sql = "UPDATE tabla_ejemplo SET nombre = ? WHERE id = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros (nuevo nombre y ID)
            preparedStatement.setString(1, "Nuevo Nombre");
            preparedStatement.setInt(2, 2);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);
            } else {
                System.out.println("No se realizaron actualizaciones.");
            }

            preparedStatement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
