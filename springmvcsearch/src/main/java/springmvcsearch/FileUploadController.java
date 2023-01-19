package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		String str=null;
		//System.out.println(str.length());
		return "fileform";
		
	}
	@RequestMapping(path="/uploadimage",method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m) {
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		byte[] data =file.getBytes();
		
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fos=new FileOutputStream(path); 
		fos.write(data);
		fos.close();
		System.out.println("file uploaded");
		m.addAttribute("filename", file.getOriginalFilename());
		m.addAttribute("msg", "upload sucessfull");
		
		}catch(IOException i) {
			System.out.println(i);
			System.out.println("uploading error");
			m.addAttribute("msg", "uploading Error");
		}
		return "filesuccess";
		
	}
}
