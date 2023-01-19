package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	//@RequestMapping("/home")
	@RequestMapping(path="/home",method =RequestMethod.POST)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name" ,"kousik Mondal");
		model.addAttribute("id",1421);
		
		
		/*
		 * List<String> friends=new ArrayList<String>(); friends.add("kousik");
		 * friends.add("Mondal");
		 * 
		 * model.addAttribute("f",friends);
		 */
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", "Kousik");
		modelAndView.addObject("roll", 8013);
		
		LocalDateTime now =LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		modelAndView.addObject("marks", list);
		
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
