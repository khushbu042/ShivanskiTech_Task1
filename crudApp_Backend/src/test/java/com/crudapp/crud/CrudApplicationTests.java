package com.crudapp.crud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudapp.crud.database.UserDatabase;
import com.crudapp.crud.model.User;

@SpringBootTest
class CrudApplicationTests {

	@Autowired
	UserDatabase userData;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		User u=new User();
		u.setName("Vandana");
		u.setEmail("mandaloi @gmail.com");
		u.setPhone("8342569823");
		u.setEmptitle("Software Engineer");
		userData.save(u);
	}

}
