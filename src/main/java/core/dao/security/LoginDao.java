package core.dao.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import core.dao.ConnectJDBC;
import core.model.User;

public class LoginDao {
	
//	Function -----------------------------------------------------------------------------
	public User queryUserByLogin(String email,String password){
		ConnectJDBC connecJdbc = new ConnectJDBC();
		Connection conn = null;
		PreparedStatement ps = null;
		try{ 
			conn = connecJdbc.getConnectionDB();

		    ps = conn.prepareStatement("SELECT id, name, username, password, email FROM user WHERE email=? and password=?");  
			ps.setString(1,email);  
			ps.setString(2,password);  
			ResultSet rs = ps.executeQuery(); 
		    
		    User user = new User();
		    while(rs.next()){
		    	user.setId(rs.getInt("id"));
		    	user.setName(rs.getString("name"));
		    	user.setUsername(rs.getString("username"));
		    	user.setPassword(rs.getString("password"));
		    	user.setEmail(rs.getString("email"));
		    }

		    rs.close();
		    ps.close();
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
