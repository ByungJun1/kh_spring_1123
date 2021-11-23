package com.mycompany.myapp23.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp23.member.service.MemberService;
import com.mycompany.myapp23.member.vo.Member;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/signUp", method = {RequestMethod.POST})
	public String signUp(Member m) {
		System.out.println("controller m : "+m);
		memberService.insertmember(m);
		
	
		return "redirect:/index";
		
		
	}
	
}
