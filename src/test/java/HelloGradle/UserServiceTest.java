package HelloGradle;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import Model.User;

public class UserServiceTest {
	
	private UserInfoService service;

	@Before
	public void SetUp() {
		service = new UserInfoService();
	}

	@Test
	public void TestCreateUser()
	{
		User user = service.CreateUser();
		assertNotNull(user);

	}
	

}
