package onset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public Connection con = null;
    public Statement state = null;

    public DBConnection () {
        String server = "jdbc:sqlserver://localhost:1433;";
        String database = "database=" + "Onset" + ";";
        String us = "user=" + "sa" + ";";
        String pass = "password=" + "123456" + ";";

        String conString = server + database + us + pass
            + "selectMethod=cursor";

        try {
            con = DriverManager.getConnection(conString);
            state = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public ResultSet getSQLQuery(String sql){
        ResultSet rs = null;
		
        try {
            rs=state.executeQuery(sql);
        } catch(SQLException e){
            
        }
		
        return rs;
    }
	
	public int getLastId(String tablename){
        ResultSet rs = null;
		
        int id = -1;
		
        try {
            String sql = "SELECT " + tablename + "ID FROM " + tablename + " WHERE " + 
				tablename + "ID=(SELECT MAX(" + tablename + "ID) FROM " + tablename +")";
            
			rs = state.executeQuery(sql);
            while(rs.next()) {
                id = Integer.parseInt(rs.getString(tablename+"ID"));
            }
            
        } catch(SQLException e){
            
        }
		
        return id;
    }
}
