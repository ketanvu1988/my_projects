package com.emailTest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController 
{
	@Autowired
	private MailDao mailDao;
@RequestMapping("/mailexample")
public String sendMail()   
	{
	return "sendMail";
	}
@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
public  String sendMaill(@ModelAttribute("mailmodel") MailModel mailmodel,Model model)
{
	try {
		
		mailDao.sendEmail(mailmodel);	
	}catch(Exception e) {
		System.out.println(e.getMessage());	
	}
	
	model.addAttribute("emailmsg","Email Send Successfully");
	return "SendEmail";
}
@ResponseBody
@RequestMapping(value="/uploadFile",method = { RequestMethod.GET,RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
public  String uploadFile( Model model, @RequestPart(value = "file") MultipartFile file,HttpSession session, HttpServletRequest request, HttpServletRequest response)
{
	System.out.println("inside scholarship save_update  images ");
	String path = session.getServletContext().getRealPath("/");
	String filename = file.getOriginalFilename();
	
	long filesize = file.getSize();
	System.out.println("filesize" + filesize);
	System.out.println("filename" + filename);
	String newPath = path + "/" + filename;
	String filePath = "\"" + newPath + "\"";
	System.out.println("filePath" + filePath.toString());
	try {
		byte barr[] = file.getBytes();

		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + filename));
		bout.write(barr);
		bout.flush();
		bout.close();
	} catch (Exception e) {
		System.out.println(e);
	}
	String status = "Enable";
	return "SendEmail";
}

}
