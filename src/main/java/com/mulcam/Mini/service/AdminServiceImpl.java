package com.mulcam.Mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.Mini.dao.AdminDAO;
import com.mulcam.Mini.dto.Admin;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDAO adminDAO;
	
	@Override
	public Admin login(String id, String password) throws Exception {
		Admin am = null;
		try {
			 am = adminDAO.queryAdmin(id);
			if(!am.getPassword().equals(password)) {
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception("비밀번호가 틀립니다");
		}
		
		return am;
	}

}
