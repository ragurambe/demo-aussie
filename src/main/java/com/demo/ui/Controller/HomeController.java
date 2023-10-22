
package com.demo.ui.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author raguram.maniyarasu
 *
 */

@Controller
public class HomeController {
	Logger logger = LogManager.getLogger(HomeController.class);

	@GetMapping("/")
	public String viewHomePage(Model model) {
		logger.info("loading route '/' - index page");
		model.addAttribute("message", "Welcome");
		return "index";
	}

	@GetMapping("/user")
	public String addNewEmployee(
			@RequestParam(value = "username", defaultValue = "John", required = true) String username, Model model) {
				 .addAttribute("username", System.getProperty("user.name"));
		return "user";
	}

	@GetMapping("/error")
	public String errorPage(Model model) {
		model.addAttribute("message", "Something went wrong");
		return "error";
	}

}