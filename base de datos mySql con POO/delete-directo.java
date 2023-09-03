import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteFromMySQL {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/tu_basededatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            String sql = "DELETE FROM tabla_ejemplo WHERE id = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            // Establecer el valor del parámetro (ID a eliminar)
            preparedStatement.setInt(1, 3);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa. Filas afectadas: " + filasAfectadas);
            } else {
                System.out.println("No se eliminaron filas.");
            }

            preparedStatement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
