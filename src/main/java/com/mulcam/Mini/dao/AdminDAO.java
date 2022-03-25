package com.mulcam.Mini.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mulcam.Mini.dto.Admin;

@Mapper
@Repository
public interface AdminDAO {
	public Admin queryAdmin(String id) throws Exception;
}
