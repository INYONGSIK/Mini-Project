package com.mulcam.Mini.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.Mini.dao.PictureDAO;
@Service
public class PictureServiceImpl implements PictureService {
	@Autowired
	PictureDAO pictureDAO;
	@Override
	public List<Map<String, String>> getPictures(String categori) throws Exception {
		List<Map<String, String>> pictures = pictureDAO.getPictures(categori);
		return pictures;
	}

}
