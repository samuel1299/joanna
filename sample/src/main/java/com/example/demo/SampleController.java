package com.example.demo;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@Autowired
	SampleRepository samplerepo;
	
	@RequestMapping("/")
	public String login(@ModelAttribute("signup") SignUp data)
	{
		return "login";
	}
	
	@RequestMapping("/login")
    public String home(@ModelAttribute("signup") SignUp data,HttpSession session)
	{
		samplerepo.save(data);
		session.setAttribute("username", data.getUsername());
		return "success";
	}
	@RequestMapping("/editpage")
	public String editlauncher(@ModelAttribute("signup") SignUp data)
	{
		return "editpage";
	}
	
	@RequestMapping("/edit")
    public String edit(@ModelAttribute("signup") SignUp data,ModelMap m,HttpSession session)
	{
		String str=(String) session.getAttribute("username");
	    Optional<SignUp> opt=samplerepo.findById(str);
	    if(opt.isPresent())
	    {
	    	SignUp obj=new SignUp();
	    	obj.setPassword(data.getPassword());
	    	obj.setUsername(opt.get().getUsername());
	    	 samplerepo.save(obj);
	    	 
	    	 m.addAttribute("data",str);
	    	 return "success";
	    }
	  return "login";
		
	}
	
	@RequestMapping("/delete")
    public String delete(@ModelAttribute("signup") SignUp data,HttpSession session)
	{
		String str=(String) session.getAttribute("username");
		samplerepo.deleteById(str);
		return "success";
	}
}
