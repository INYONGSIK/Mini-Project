package com.mulcam.Mini.service;

import com.mulcam.Mini.dto.Member;

public interface MemberService {
	Member login(String id, String password) throws Exception;
	Member join(Member member) throws Exception;
}
	