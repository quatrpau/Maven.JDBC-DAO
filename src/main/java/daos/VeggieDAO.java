package daos;

import models.DAOInterface;
import models.GetConnected;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VeggieDAO implements DAOInterface<VeggieDTO> {
    public VeggieDTO findById(int id) {
        Connection connection = GetConnected.getConnected();
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM veggies WHERE id = ?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){

            }
        }
        catch(SQLException sqlx){
            sqlx.printStackTrace();
        }
        return null;
    }

    public List<VeggieDTO> findAll() {
        return null;
    }

    public VeggieDTO update(VeggieDTO dto) {
        return null;
    }

    public VeggieDTO create(VeggieDTO dto) {
        return null;
    }

    public void delete(int id) {
    }
    
}
