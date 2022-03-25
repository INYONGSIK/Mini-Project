package com.mulcam.Mini.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.Mini.dto.Member;

@Mapper
@Repository
public interface MemberDAO {
	public void insertMember(Member member) throws Exception;
	public Member queryMember(String id) throws Exception;
}
