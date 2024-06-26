package com.gfg.springtomcat;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController implements ErrorController {

	@GetMapping("/")
	public String getMessage()
	{
		return "forward:index.html";
	}

}
