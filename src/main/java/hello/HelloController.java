package hello;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.*;

@Controller
@EnableAutoConfiguration

public class HelloController {

    @RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/more")
	@ResponseBody
	String more() {
		return "more option is selected";
	}

	public static void main(String[] args){
		SpringApplication.run(HelloController.class, args);
	}
}
