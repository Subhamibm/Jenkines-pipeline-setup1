package com.ibm;

import com.ibm.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class JenkinsSetup1ApplicationTests {

	MyController myCon = new MyController();

	@Test
	void testGetData() {

		String output = myCon.getData();
		assert output!= "": "Hello, I am from getData";
	}

	@Test
	void testGetIBM() {

		String output = myCon.getData();
		assert output!= "": "Hello, I am from IBM";
	}

	@Test
	void testPostData() {

		String output = myCon.getData();
		assert output!= "": "Hello, I am from postData, your data is being updated...";
	}

}
