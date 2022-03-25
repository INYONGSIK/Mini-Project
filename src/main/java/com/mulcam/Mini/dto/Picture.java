package com.mulcam.Mini.dto;

public class Picture {
	String categori;
	int seq;
	String url;
	public Picture() {}
	public Picture(String categori, int seq,String url) {
		this.categori=categori;
		this.seq=seq;
		this.url=url;
	}
	public String getCategori() {
		return categori;
	}
	public void setCategori(String categori) {
		this.categori = categori;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

	
	
}

