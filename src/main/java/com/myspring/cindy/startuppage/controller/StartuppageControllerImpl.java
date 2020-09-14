package com.myspring.cindy.startuppage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.cindy.startuppage.service.StartupPageService;
import com.myspring.cindy.startuppage.vo.PageVO;
import com.myspring.cindy.startuppage.vo.StartupPageVO;

@Controller("startuppagecontroller")
public class StartuppageControllerImpl implements StartuppageController{
	@Autowired
	private StartupPageService startuppageservice;
	@Autowired
	private StartupPageVO startuppagevo;
	@RequestMapping(value = {"/startuppage/manu_prodlist.do","/startuppage/consultinglist.do","/startuppage/manu_estilist.do"}, method = RequestMethod.GET)
	private ModelAndView prodlist(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
			request.setCharacterEncoding("utf-8");
			response.setContentType("html/text;charset=utf-8");
			String viewName = (String)request.getAttribute("viewName");
			int total = startuppageservice.listCount();
			if(nowPage == null && cntPerPage == null) {
				nowPage = "1";
				cntPerPage = "10";
			}else if(nowPage == null) {
				nowPage = "1";
			}else if(cntPerPage == null) {
				cntPerPage = "10";
			}
			pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
			List<StartupPageVO> prodlist = startuppageservice.listprod(pagevo);
			List<StartupPageVO> conlist = startuppageservice.listcon(pagevo);
			List<StartupPageVO> estilist = startuppageservice.listesti(pagevo);
			ModelAndView mav = new ModelAndView();
			mav.addObject("prodlist",prodlist);
			mav.addObject("conlist",conlist);
			mav.addObject("estilist",estilist);
			System.out.println(prodlist);
			return mav;
	}
	
}
