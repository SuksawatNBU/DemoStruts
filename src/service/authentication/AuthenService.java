
package service.authentication;

import dao.authentication.AuthenDao;
import model.User;

public class AuthenService {
	
	public User queryUserByLogin(String email, String password){
		AuthenDao authen = new AuthenDao();
		return authen.queryUserByLogin(email, password);
	}
	
}