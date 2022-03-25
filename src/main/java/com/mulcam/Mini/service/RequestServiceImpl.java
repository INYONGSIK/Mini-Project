package com.mulcam.Mini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.Mini.dao.RequestDAO;
import com.mulcam.Mini.dto.Request;
@Service
public class RequestServiceImpl implements RequestService {
	
	@Autowired
	RequestDAO requestDAO;

	@Override
	public Request order(Request request) throws Exception {
		 requestDAO.insertRequest(request);
		return request;
		
	}

}
