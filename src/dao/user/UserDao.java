package dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectJDBC;
import model.User;

public class UserDao {
	
//	Function -----------------------------------------------------------------------------
	
	// Register
	public User queryUserByLogin(User user){
		ConnectJDBC connecJdbc = new ConnectJDBC();
		Connection conn = null;
		PreparedStatement ps = null;
		try{ 
			conn = connecJdbc.getConnectionDB();

		    ps = conn.prepareStatement("INSERT INTO user (name, username, password, email) VALUES " + "(?,?,?,?)");  
			ps.setString(1,user.getName());
			ps.setString(2,user.getUsername());
			ps.setString(3,user.getPassword());
			ps.setString(4,user.getEmail());
			
			ps.executeUpdate();
			
		    ps.close();
		    conn.close();
		    return user;
		}catch(SQLException se){
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			connecJdbc.closeConnectionPrepar(ps);
			connecJdbc.closeConnectionConn(conn);
		}
		return null;
	}

}
