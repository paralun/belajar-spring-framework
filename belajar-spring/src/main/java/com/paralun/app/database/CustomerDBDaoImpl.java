package com.paralun.app.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

public class CustomerDBDaoImpl implements CustomerDBDao{
    
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(CustomerDB cdb) {
        String sql = "insert into customer (cust_id,nama,umur) values (?,?,?)";
        Connection conn = null;
        try{
            conn = dataSource.getConnection();
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, cdb.getCustId());
                ps.setString(2, cdb.getNama());
                ps.setInt(3, cdb.getUmur());
                ps.executeUpdate();
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }finally{
            if (conn != null) {
		try {
                    conn.close();
		} catch (SQLException e) {}
            }
        }
    }

    @Override
    public CustomerDB getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
