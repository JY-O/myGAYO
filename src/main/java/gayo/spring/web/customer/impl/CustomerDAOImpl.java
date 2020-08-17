package gayo.spring.web.customer.impl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject SqlSession sql;
	//회원가입
	
	@Override
	public void register(CustomerVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
	
	@Override
	public CustomerVO login(CustomerVO vo) throws Exception{
			return sql.selectOne("customerMapper.login", vo);
	}
	
	//서비스에서 보낸 파라미터들을 customerUpdate(CustomerVO vo)에 담습니다.
	@Override
	public void customerUpdate(CustomerVO vo) throws Exception{
		// vo에 담긴 파라미터들은 customerMapper.xml에 customerMapper라는 namespace에
		// 아이다가 customerUpdate인 쿼리에 파라미터들을 넣어줍니다.
		sql.update("customerMapper.customerUpdate", vo);
	}
	
}
