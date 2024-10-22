package hotel_transilvania_persona;

import java.sql.*;

public class personaDB {

private Connection conexion;
	
	public personaDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	
	public void agregarPersona(persona per) {
		String sql="INSERT INTO persona(apellido,nombre,ci,num_celular) VALUES(?,?,?,?)";
		try (PreparedStatement parametro = conexion.prepareStatement(sql)){
			parametro.setString(1, per.getApellido());
			parametro.setString(2, per.getNombre());
			parametro.setInt(3, per.getCi());
			parametro.setInt(4,per.getNum_celular() );
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarPersona(persona per, int id) {
        String sql = "UPDATE persona SET  apellido =?,nombre = ?, ci, num_celular = ? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setString(1,per.getApellido());
            parametro.setString(2, per.getNombre());
            parametro.setInt(3, per.getCi());
            parametro.setInt(4, per.getNum_celular());
            parametro.setInt(5, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarPersona(int id) {
        String sql = "DELETE FROM persona WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public persona obtenerlista(int id) {
        String sql = "SELECT * FROM persona WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new persona(
                		rs.getString("apellido"), 
                		rs.getString("nombre"),
                		rs.getInt("ci"), 
                		rs.getInt("numero celular"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
