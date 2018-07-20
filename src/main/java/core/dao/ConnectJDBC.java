package core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectJDBC {
	
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	final String DB_URL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	final String USER = "root";
	final String PASS = "086202";
	
	public Connection getConnectionDB() throws Exception{
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS); 
		} catch (SQLException sq) {
			throw sq;
		} catch(Exception e) {
			throw e;
		}
		return conn;
	}
	
	public void closeConnectionConn(Connection conn){
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void closeConnectionStmt(Statement stmt){
		try {
			if(stmt!=null && !stmt.isClosed()) {
				stmt.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnectionPrepar(PreparedStatement ps){
		try {
			if(ps!=null && !ps.isClosed()) {
				ps.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnectionRes(ResultSet rs){
		try {
			if(rs!=null && !rs.isClosed()) {
				rs.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
