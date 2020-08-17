package gayo.spring.web.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import gayo.spring.web.customer.impl.CustomerDAO;
import gayo.spring.web.customer.impl.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Inject CustomerDAO dao;
	
	@Override
	public void register(CustomerVO vo) throws Exception {
		dao.register(vo);
	}
	
	@Override
	public CustomerVO login(CustomerVO vo) throws Exception {
		return dao.login(vo);
	}
	
	//Controller에서 보내는 파라미터들을 customerUpdate(CustomerVO vo)로 받고
	@Override
	public void customerUpdate(CustomerVO vo) throws Exception{
		// 받은 vo를 DAO로 보내줍니다.
		dao.customerUpdate(vo);
	}

}
