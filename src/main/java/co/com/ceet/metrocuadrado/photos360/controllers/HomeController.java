package co.com.ceet.metrocuadrado.photos360.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	public final static String INDEX = "index";
	
	@CrossOrigin()
	@GetMapping("/")
	public String index(){
		
		return INDEX;
	}

}
