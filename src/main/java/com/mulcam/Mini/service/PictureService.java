package com.mulcam.Mini.service;

import java.util.List;
import java.util.Map;

public interface PictureService {
	List<Map<String, String>> getPictures(String categori) throws Exception;
}
