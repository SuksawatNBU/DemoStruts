/**
 * 
 */
/**
 * @author Suksawat.t
 *
 */
package manager.authentication;

import bean.User;
import service.authentication.AuthenService;

public class AuthenManager {
	
	public User validateLogin(String email, String password){
		User userResult = new User();
		// ค้นหาข้อมูลผู้ใช้
		try{
			AuthenService service = new AuthenService();
			userResult = service.queryUserByLogin(email, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return userResult;
	}
	
}