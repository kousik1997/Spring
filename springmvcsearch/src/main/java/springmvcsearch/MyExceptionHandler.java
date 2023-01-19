package springmvcsearch;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class MyExceptionHandler {
	
	
	//handell exception in our mvc
	
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String exceptionHanderNull() {
		return "null_page";
		
	}
	
	@ExceptionHandler(value= Exception.class)
	public String exceptionHanderGenric() {
		
		
		return "null_page";
		
	}
}
