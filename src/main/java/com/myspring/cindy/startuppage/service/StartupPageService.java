package com.myspring.cindy.startuppage.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.startuppage.vo.StartupPageVO;

public interface StartupPageService {
	public List<StartupPageVO> listesti(PageVO pagevo) throws DataAccessException;  
	public int listCount() throws DataAccessException;
	public List<StartupPageVO> listprod(PageVO pagevo) throws DataAccessException;
	public List<StartupPageVO> listcon(PageVO pagevo) throws DataAccessException;
}
