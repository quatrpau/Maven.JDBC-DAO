package daos;

import models.DAOInterface;
import models.GetConnected;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeggieDAO implements DAOInterface<VeggieDTO> {
    public VeggieDTO findById(int id) {
        Connection connection = GetConnected.getConnected();
        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM veggies WHERE id = ?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getInt("id") == id){
                    return extract(rs);
                }
            }
        }
        catch(SQLException sqlx){
            sqlx.printStackTrace();
        }
        return null;
    }
    public VeggieDTO extract(ResultSet rs) throws SQLException{
        return new VeggieDTO(rs.getInt("id")
                ,rs.getString("name")
                ,Type.valueOf(rs.getString("type"))
                ,Status.valueOf(rs.getString("status"))
                ,rs.getString("last_name"));
    }

    public List<VeggieDTO> findAll() {
        Connection connection = GetConnected.getConnected();
        try {
            List<VeggieDTO> veggies = new ArrayList<VeggieDTO>();
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM veggies");
            ResultSet rs = pstmt.executeQuery();
            rs.beforeFirst();
            while(rs.next()){
                veggies.add(extract(rs));
            }
        }
        catch(SQLException sqlx){
            sqlx.printStackTrace();
        }
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
