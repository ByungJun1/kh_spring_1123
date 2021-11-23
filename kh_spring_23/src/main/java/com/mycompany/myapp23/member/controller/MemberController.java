package com.mycompany.myapp23.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp23.member.service.MemberService;
import com.mycompany.myapp23.member.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="signUp")
	public String signUp(Member m, Model model) {
		try {
			int result = memberService.signUp(m);
			String msg = null;
			System.out.println("controller m : "+m);
			if(result > 0)
				msg = "회원가입성공";
			else
				msg = "회원가입실패";
			model.addAttribute("msg",msg);
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "오류발생");
		}
		return "redirect:/";		
	}
	
}
