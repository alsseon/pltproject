package com.myspring.cindy.startuppage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.startuppage.vo.StartupPageVO;

public interface StartupPageDAO {

	List<StartupPageVO> selectAllEstiList(PageVO pagevo) throws DataAccessException;

	int listCount() throws DataAccessException;

	List<StartupPageVO> selectAllProdList(PageVO pagevo) throws DataAccessException;

	List<StartupPageVO> selectAllConList(PageVO pagevo) throws DataAccessException;

}
