package com.mulcam.Mini.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mulcam.Mini.dto.Member;
import com.mulcam.Mini.dto.Request;
import com.mulcam.Mini.service.AdminService;
import com.mulcam.Mini.service.MemberService;
import com.mulcam.Mini.service.PictureService;
import com.mulcam.Mini.service.RequestService;


@Controller
public class MemberController {
	@Autowired
	HttpSession session;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	PictureService pictureService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	RequestService requestService;
	
	@GetMapping("/login")
	public String loginview() {
		return "login";
}
//	@GetMapping("/picture")
//	public String pictureview(Model model) throws Exception {
//		List<Map<String, String>> homepage = pictureService.getPictures("h");
//		model.addAttribute("homepage", homepage);
//		List<Map<String, String>> shop = pictureService.getPictures("s");
//		model.addAttribute("shop", shop);
//		List<Map<String, String>> design = pictureService.getPictures("d");
//		model.addAttribute("design", design);
//		List<Map<String, String>> web = pictureService.getPictures("w");
//		model.addAttribute("web", web);
//		return "picture";
//	}
	
	@GetMapping({"/", "/index"})
	public String indexview(Model model) throws Exception {

		List<Map<String, String>> homepage = pictureService.getPictures("h");
		model.addAttribute("homepage", homepage);
		List<Map<String, String>> shop = pictureService.getPictures("s");
		model.addAttribute("shop", shop);
		List<Map<String, String>> design = pictureService.getPictures("d");
		model.addAttribute("design", design);
		List<Map<String, String>> web = pictureService.getPictures("w");
		model.addAttribute("web", web);
		return "index";
	}
		
//	@PostMapping("/login.do")
//	public String login(@RequestParam("id") String id,@RequestParam("password")String password, Model model) {  //login.jsp의 name값을 가져온다
//		try {
//			Member mem = memberService.login(id, password);
//			
//			if(mem!=null) {
//				session.setAttribute("id", id);
//				if(mem.getId().equals("admin")) {
//					return "admin";	
//				}
//			}
//		} catch (Exception e) {
//			model.addAttribute("err",e.getMessage());
//			return "err";
//		}
//		return "index";
//	}
	
	@PostMapping("/login.do")
	public String login(@RequestParam("id") String id, @RequestParam("password") String password, Model model) { 
		try {
			Member member = memberService.login(id, password);
			session.setAttribute("id", id);
			if("b".equals(member.getType())){
//				List<Map<String, String>> homepage = pictureService.getPictures("h");
//				model.addAttribute("homepage", homepage);
//				List<Map<String, String>> shop = pictureService.getPictures("s");
//				model.addAttribute("shop", shop);
//				List<Map<String, String>> design = pictureService.getPictures("d");
//				model.addAttribute("design", design);
//				List<Map<String, String>> web = pictureService.getPictures("w");
//				model.addAttribute("web", web);
				return "index";
			}else  {
				return "admin";
			}
			
//			if (memberService.login(id, password) != null) {
//				session.setAttribute("id", id);
//			} else {
//				if (adminService.login(id, password) != null) {
//					System.out.println("asdasdasd");
//					session.setAttribute("id", id);
//					return "admin";
//				}
//
//			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("err", e.getMessage());
			return "err";
		}
		//return "index";
	}

//	@PostMapping("/login.do")
//	public String login(@RequestParam("id") String id,@RequestParam("password")String password, Model model) {  //login.jsp의 name값을 가져온다
//		try {
//			memberService.login(id,password);
//			session.setAttribute("id",id);
//		}catch(Exception e) {
//			model.addAttribute("err", e.getMessage());
//		}
//		return "index";
//	}
//	

	
	@GetMapping("/register")
	public String joinview() {
		return "register";
	}
	
	@PostMapping("/register.do")
	public String register(@ModelAttribute Member member, Model model) {
		try {
			member.setType("b");
			memberService.join(member);
		}catch(Exception e) {
			model.addAttribute("err",e.getMessage());
			return "err";
		}
		return "login";
	}
	
	@GetMapping(value="/logout")
	public String logout(HttpServletRequest request, Model model) {
		session.removeAttribute("id");
		
		return "login";
	}
	
//	@PostMapping("/request")
//	public String request(@ModelAttribute Request request,Model model) {
//		if(session.getId() != null) {
//			try {
//				requestService.order(request);
//			} catch (Exception e) {
//				model.addAttribute("err",e.getMessage());
//				return "err";
//			}
//			return "index";
//		}else
//			return "login";
//		}	
	@ResponseBody
	@PostMapping("/request")
	public ResponseEntity<String> request(@ModelAttribute Request request,Model model) throws Exception {
		ResponseEntity<String> data = null;
		if(session.getAttribute("id") != null) {
			requestService.order(request);
			data= new  ResponseEntity<String>("제출 성공",HttpStatus.OK);
		}else  {
			data = new ResponseEntity<String>("로그인이 필요합니다", HttpStatus.BAD_REQUEST);
//			return "login";
		}
		return data;
	}
	
//	@GetMapping(value="/fileview/board/{filename}")
//	public void fileview(@PathVariable String filename, 
//			HttpServletRequest request,  HttpServletResponse response) {
//		String path = servletContext.getRealPath("/image/");
//		File file = new File(path+filename);
//		String sfilename = null;
//		FileInputStream fis = null;
//		try {
//			if(request.getHeader("User-Agent").indexOf("MSIE")>-1) {
//				sfilename= URLEncoder.encode(file.getName(),"utf-8");
//			} else {
//				sfilename = new String(file.getName().getBytes("utf-8"), "ISO-8859-1");
//			}
//			response.setCharacterEncoding("utf-8");
//			response.setContentType("application/octet-stream;charset=utf-8");
//			response.setHeader("Content-Disposition", "attachenet; filename=\""+sfilename+"\";");
//			OutputStream out = response.getOutputStream();
//			fis= new FileInputStream(file);
//			FileCopyUtils.copy(fis, out);
//			out.flush(); 
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(fis!=null) {
//				try {
//					fis.close();
//				} catch(Exception e) {}
//			}
//		}
//	}
}