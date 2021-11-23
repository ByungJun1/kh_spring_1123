package com.mycompany.myapp23.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp23.member.vo.Member;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSessionTemplate;
	
	public int signUp(Member m)throws Exception {
		System.out.println("m: "+m);
		return sqlSessionTemplate.insert("MemberMapper.signUp", m);
	}
}

