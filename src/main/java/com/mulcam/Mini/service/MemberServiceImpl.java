package com.mulcam.Mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.Mini.dao.MemberDAO;
import com.mulcam.Mini.dto.Member;
@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public Member login(String id, String password) throws Exception {
		Member mem = null;

		mem = memberDAO.queryMember(id);
		if (mem==null) {
			return mem;
		} else if (!mem.getPassword().equals(password)) {
			throw new Exception("비밀번호가 틀립니다.");
		} 
		return mem;
	}

	@Override
	public Member join(Member member) throws Exception {
		Member mem = memberDAO.queryMember(member.getId());
		try {
		if(mem!=null) {
			throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception("이미 있는 아이디입니다.");
		}
		memberDAO.insertMember(member);
		return memberDAO.queryMember(member.getId());
	}
	
}
