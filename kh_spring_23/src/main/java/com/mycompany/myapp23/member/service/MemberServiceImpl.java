package com.mycompany.myapp23.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp23.member.dao.MemberDao;
import com.mycompany.myapp23.member.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberDao mDao;
	
	@Override
	public void insertmember(Member m) {
		mDao.insertMember(m);
	}
}
