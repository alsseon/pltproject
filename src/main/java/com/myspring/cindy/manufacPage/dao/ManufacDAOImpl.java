package com.myspring.cindy.manufacPage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.cindy.manufacPage.dao.ManufacDAO;
import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.manufacPage.vo.ManufacVO;

@Repository("manufacdao")
public class ManufacDAOImpl implements ManufacDAO{
		@Autowired
		private SqlSession sqlSession;
		@Override
		public int listCount() throws DataAccessException{
			int listCount = sqlSession.selectOne("mapper.manufacpage.listCount");
			System.out.println(listCount);
			return listCount;
		}
		@Override
		public List<ManufacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException{
			System.out.println("dao 실행?");
			List<ManufacVO> estiList = null;
			estiList = sqlSession.selectList("mapper.manufacpage.selectAllEstilist",pagevo);
			System.out.println("dao:"+estiList);
			return estiList;
		}
		@Override
		public List<ManufacVO> selectAllProdList(PageVO pagevo) throws DataAccessException{
			System.out.println("dao 실행?");
			List<ManufacVO> prodList = null;
			prodList = sqlSession.selectList("mapper.manufacpage.selectAllProdlist",pagevo);
			System.out.println("dao:"+prodList);
			return prodList;
		}
		@Override
		public int deleteesti(int no) throws DataAccessException {
			int deleteesti = sqlSession.delete("mapper.manufacpage.deleteesti", no);
			System.out.println("del" + deleteesti);
			return deleteesti;
		}

}
