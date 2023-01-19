package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId")int userId) {

		System.out.println("userId is "+userId);
		return "home";

	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home view....");
		
		String str=null;
		//System.out.println(str.length());
		return"home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		if(query.length()>0) {
			String url="https://www.google.com//search?q=" + query;
			RedirectView redirectView =	new RedirectView();
			redirectView.setUrl(url);
			return redirectView;
		}
		else {
			RedirectView redirectView = new RedirectView();
			redirectView.setUrl("wrongsearch");
			return redirectView;

		}

	}
	@RequestMapping("/wrongsearch")
	public String wrongsearch() {
		System.out.println("going to wrong search view....");
		return"home";
	}
	
	/*
	//handell exception in our mvc
	
	
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exceptionHanderNull() {
		return "null_page";
		
	}
	
	@ExceptionHandler(value= Exception.class)
	public String exceptionHanderGenric() {
		
		
		return "null_page";
		
	}
	*/


}
