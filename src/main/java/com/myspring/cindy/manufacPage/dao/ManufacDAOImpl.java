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
			
			return listCount;
		}
		@Override
		public List<ManufacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException{
			;
			List<ManufacVO> estiList = null;
			estiList = sqlSession.selectList("mapper.manufacpage.selectAllEstilist",pagevo);
			
			return estiList;
		}
		@Override
		public List<ManufacVO> selectAllProdList(PageVO pagevo) throws DataAccessException{
			
			List<ManufacVO> prodList = null;
			prodList = sqlSession.selectList("mapper.manufacpage.selectAllProdlist",pagevo);
			
			return prodList;
		}
		@Override
		public int deleteesti(int no) throws DataAccessException {
			int deleteesti = sqlSession.delete("mapper.manufacpage.deleteesti", no);
			
			return deleteesti;
		}
		@Override
		public int quotestatus(int quotestatus, int no) throws DataAccessException{
			int result = 0;
			if (quotestatus == 0) {
				result = sqlSession.update("mapper.manufacpage.upstatus_esti_ing",no); //누르면 진행중으로 업데이트
				System.out.println("dao result" + result);
			}else if(quotestatus == 1) {
				result = sqlSession.update("mapper.manufacpage.upstatus_esti_com",no);//완료로 업데이트ㄴ
			}
			return result;
		}
		
}
