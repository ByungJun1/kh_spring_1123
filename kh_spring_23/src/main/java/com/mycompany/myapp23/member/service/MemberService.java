package com.mycompany.myapp23.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.myapp23.member.vo.Member;

public interface MemberService {
	public int signUp(Member m) throws Exception;
}
