package com.shenchao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybabasportApplicationTests {
	@Autowired
	private SqlSessionFactory factory;

	@Test
	public void contextLoads() {
		System.out.println(factory);
	}

}
