package com.mulcam.Mini.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.Mini.dto.Request;

@Mapper
@Repository
public interface RequestDAO {
	public void insertRequest(Request request) throws Exception;
	
}
