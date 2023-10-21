
package com.demo.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.ui.Utilities.WindowsUserInfo;
import com.demo.ui.Utilities.WindowsUserInfoService;

/**
 * @author raguram.maniyarasu
 *
 */

@Controller
public class HomeController {

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("message", "Welcome");
		return "index";
	}

	@GetMapping("/user")
	public String addNewEmployee(
			@RequestParam(value = "username", defaultValue = "John", required = true) String username, Model model) {
//    	WindowsUserInfo userInfo = WindowsUserInfoService.getLoggedInUserDetails();
		model.addAttribute("username", System.getProperty("user.name") + System.getProperty("os.name"));
		return "user";
	}

	@GetMapping("/error")
	public String errorPage(Model model) {
		model.addAttribute("message", "Something went wrong");
		return "error";
	}

}