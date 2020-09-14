package com.myspring.cindy.manufacPage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.cindy.manufacPage.vo.ManufacVO;
import com.myspring.cindy.startuppage.vo.PageVO;

public interface ManufacDAO {

	int listCount() throws DataAccessException;

	List<ManufacVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;


	List<ManufacVO> selectAllProdList(PageVO pagevo) throws DataAccessException;



	int deleteesti(int no) throws DataAccessException;

}
