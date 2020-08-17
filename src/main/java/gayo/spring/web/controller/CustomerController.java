package gayo.spring.web.controller;

/*
1. 회원가입은 추가로 mapper.xml 작성하고, 퍼블한 jsp파일로 경로 잡아준다.
2. 로그인은 mapper.xml 에 로그인 부분 작성하고 퍼블한 jsp파일 경로 잡고 추가로
	여기서 부터는 게시판과 연동(후기게시판)
	nav.jsp수정해주고 로그인 여부에 따라 로그인,로그아웃 보여주는 작업 진행.
	로그인 했을때 ???님 안녕하세요를 보여주기 위해.
	추가로 게시판 작성을 할때 로그인 여부에 따라 보여주는 설정을 해준다.
3. 회원 정보 수정도 jsp파일 수정하고 테스트해준다.

*/

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gayo.spring.web.customer.impl.CustomerVO;
import gayo.spring.web.service.CustomerService;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Inject
	CustomerService service;
	
	//회원가입 get
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegister(CustomerVO vo) throws Exception{
		logger.info("post register");
		service.register(vo);
		return null;
	}
	
	//로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(CustomerVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		CustomerVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("customer", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("customer", login);
		}
		return "redirect:/";
		
	}
	
	//로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:/";
	}
	
	//회원 정보 수정.
	@RequestMapping(value = "/customerUpdateView", method = RequestMethod.GET)
	public String registerUpdateView() throws Exception{
		return "customer/customerUpdateView";
	}
	
	@RequestMapping(value = "/customerUpdate", method = RequestMethod.POST)
	public String registerUpdate(CustomerVO vo, HttpSession session) throws Exception{
		service.customerUpdate(vo);
		session.invalidate();
		return "redirect:/";
	}
	
}









