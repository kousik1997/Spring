package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "reg form");
		m.addAttribute("Desc", "home page");
		System.out.println("adding commonDataForModel");
	}
	
	@RequestMapping("/contact")
	public String ShowForm() {
		
		System.out.println("ading ShowForm");
		return "contact";
		
	}
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	//@RequestMapping("/processform")
	public String handelForm(@RequestParam("email") String userEmail , 
							@RequestParam("username") String username ,
							@RequestParam("password") String userpassword ,
							Model model) {
		
		User user =new User();
		user.setEmail(userEmail);
		user.setUserName(username);
		user.setPassword(userpassword);
		
		System.out.println(user);
		
		/*model.addAttribute("name", username);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userpassword);
		
		
		model.addAttribute("user", user);
		return"success";
	}
	*/
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
		public String handelForm(@ModelAttribute("user") User user,Model model) {
		
		System.out.println("ading handelForm");		
		System.out.println(user);
		this.userService.createUser(user);
			
		return"success";
	}
}
