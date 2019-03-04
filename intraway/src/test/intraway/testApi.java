package intraway;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import controller.IntrawayController;
import entity.InfoIntraway;
import intraway.Application;


//@ContextConfiguration(classes=Application.class)
//@RunWith(SpringRunner.class)
//@WebMvcTest(IntrawayController.class)
//@SpringBootTest(classes = { InfoIntraway.class,IntrawayController.class })

@ContextConfiguration(classes=Application.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { InfoIntraway.class,IntrawayController.class })
@WebAppConfiguration

public class testApi {
	
	
	
	 @Autowired
	 IntrawayController controller;
	
	@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
	@Test
	public void testApi() throws Exception {
		
	
		InfoIntraway multiplo =controller.save(1, 15);
		
		InfoIntraway result = new InfoIntraway("001","Se encontraron Multiplos de 3 y 5", "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz");
		assertThat(multiplo).equals(result);
		
		
	}
	
	@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
	@Test
	public void testApi2() throws Exception {
		
	
		InfoIntraway multiplo =controller.save(11, 11);
		
		InfoIntraway result = new InfoIntraway("004","No se encontraron Multiplos de 3 ni de 5", "11");
		assertThat(multiplo).equals(result);
		
		
	}
	

	@SuppressWarnings("deprecation")
	@Test
	public void testApi3() throws Exception {
		
	
		InfoIntraway multiplo =controller.save(11, 12);
		
		InfoIntraway result = new InfoIntraway("002","Se encontraron Multiplos de 3", "11,Fizz");
		assertThat(multiplo).equals(result);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testApi4() throws Exception {
		
	
		InfoIntraway multiplo =controller.save(10, 11);
		
		InfoIntraway result = new InfoIntraway("003","Se encontraron Multiplos de 5", "Buzz,11");
		assertThat(multiplo).equals(result);
		
		
	}
	

}
