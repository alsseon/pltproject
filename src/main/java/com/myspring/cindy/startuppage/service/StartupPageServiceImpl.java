package com.myspring.cindy.startuppage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.myspring.cindy.startuppage.dao.StartupPageDAO;
import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.startuppage.vo.StartupPageVO;

@Service("startuppageservice")
public class StartupPageServiceImpl implements StartupPageService{
	@Autowired
	private StartupPageDAO startuppagedao;
	@Autowired
	private PageVO pagevo;
	
	public List<StartupPageVO> listesti(PageVO pagevo) throws DataAccessException{
		List<StartupPageVO> estilist = null;
		estilist = startuppagedao.selectAllEstiList(pagevo);
		System.out.println("service" + estilist);
		return estilist;
	}
	public int listCount() throws DataAccessException{
		return startuppagedao.listCount();
	}
	public List<StartupPageVO> listprod(PageVO pagevo) throws DataAccessException{
		List<StartupPageVO> prodlist = null;
		prodlist = startuppagedao.selectAllProdList(pagevo);
		return prodlist;
	}
	public List<StartupPageVO> listcon(PageVO pagevo) throws DataAccessException{
		List<StartupPageVO> conlist = null;
		conlist = startuppagedao.selectAllConList(pagevo);
		return conlist;
	}
}
