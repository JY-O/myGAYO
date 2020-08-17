package gayo.spring.web.customer.impl;

public interface CustomerDAO {
	//회원가입
	public void register(CustomerVO vo) throws Exception;
	
	//로그인
	public CustomerVO login(CustomerVO vo) throws Exception;
	
	//회원정보 수정
	public void customerUpdate(CustomerVO vo) throws Exception;
}
