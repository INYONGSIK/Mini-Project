package com.mulcam.Mini.service;

import com.mulcam.Mini.dto.Admin;

public interface AdminService {
	Admin login(String id, String password) throws Exception;
}
