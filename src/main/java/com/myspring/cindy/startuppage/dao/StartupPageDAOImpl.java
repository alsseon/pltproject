package com.myspring.cindy.startuppage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.startuppage.vo.StartupPageVO;

@Repository("startuppagedao")
public class StartupPageDAOImpl implements StartupPageDAO {
	@Autowired
	private SqlSession sqlSession;
	@Override
	public int listCount() throws DataAccessException{
		int listCount = sqlSession.selectOne("mapper.startuppage.listCount");
		return listCount;
	}
	@Override
	public List<StartupPageVO> selectAllEstiList(PageVO pagevo) throws DataAccessException{
		System.out.println("dao ½ÇÇà?");
		List<StartupPageVO> estiList = null;
		estiList = sqlSession.selectList("mapper.startuppage.selectAllEstilist",pagevo);
		System.out.println("dao:"+estiList);
		return estiList;
	}
	@Override
	public List<StartupPageVO> selectAllProdList(PageVO pagevo) throws DataAccessException{
		List<StartupPageVO> prodList = null;
		prodList = sqlSession.selectList("mapper.startuppage.selectAllProdlist",pagevo);
		return prodList;
	}	@Override
	public List<StartupPageVO> selectAllConList(PageVO pagevo) throws DataAccessException{
		List<StartupPageVO> conList = null;
		conList = sqlSession.selectList("mapper.startuppage.selectAllConlist",pagevo);
		return conList;
	}
}
