package HelloGradle;

import Model.User;

public class UserInfoService {
	
	public User CreateUser()
	{
		User user =new User();
		user.setName("Mike");
		user.setAddress("Zhe Jiang 2009");
		user.setAge(29);
		user.setPhone("15736772109");
		
		return user;
		
	}
	
	

}
