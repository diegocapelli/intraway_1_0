package controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.infoIntrawayDao;
import entity.InfoIntraway;

import exceptions.badrequest;


/**
 * 
 * 
 * @author Diego
 *
 */
@RestController
@RequestMapping("/api/fizzbuzz")
public class IntrawayController {



	@RequestMapping(value = "/{id1}/{id}", method = RequestMethod.GET)
	public InfoIntraway save(@PathVariable int id1,@PathVariable int id) throws Exception {
		String auxresult="";
		String description = "";
		boolean multiplo3 = false;
		boolean multiplo5 = false;
		String code = "";
		
		for(int i = id1;i <= id;i++) {
			if ((i % 3 )== 0 && (i % 5 )== 0 ) {
				if (i==id) 
					auxresult=auxresult.concat("FizzBuzz");
				else
					auxresult=auxresult.concat("FizzBuzz,");
				
				multiplo5= true;
				multiplo3 = true;
			}else if ((i % 5 )== 0) {
				if (i==id) 
					auxresult=auxresult.concat("Buzz");
				else
					auxresult=auxresult.concat("Buzz,");
				multiplo5= true;				
			}else if ((i % 3 )== 0) {			
				if (i==id) 
					auxresult=auxresult.concat("Fizz");
				else
					auxresult=auxresult.concat("Fizz,");
				multiplo3 = true;				
			}else {
				if (i==id) 
					auxresult=auxresult.concat(Integer.toString(i));		
				else
					auxresult=auxresult.concat(Integer.toString(i)+",");
			}				
		}
		if (multiplo5 && multiplo3) {
			description = "Se encontraron Multiplos de 3 y 5";
			code = "001";
		}else if (multiplo5 ) {
			description = "Se encontraron Multiplos de 5";
			code= "003";
		}else if (multiplo3 ){
			description = "Se encontraron Multiplos de 3";
			code = "002";
		}else {
			description = "No se encontraron Multiplos de 3 ni de 5";
			code = "004";
		}
	
		 if(id < id1)
			 throw new badrequest("error","Los parámetros enviados son incorrectos");
		
		
		InfoIntraway info = new InfoIntraway(code,description,auxresult);	  
		 
        infoIntrawayDao infoDao = new infoIntrawayDao();
        infoDao.save(info);
		return info;
	}
	
}
