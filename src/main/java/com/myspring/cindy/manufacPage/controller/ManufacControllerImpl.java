package com.myspring.cindy.manufacPage.controller;

import java.net.InetAddress;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.cindy.manufacPage.service.ManufacService;
import com.myspring.cindy.manufacPage.vo.ManufacVO;
import com.myspring.cindy.startuppage.vo.PageVO;

@Controller("manufaccontroller")
public class ManufacControllerImpl implements ManufacController{

		@Autowired
		private ManufacService manufacservice;
		@Autowired
		private ManufacVO manufac;
		@RequestMapping(value = {"/manufacpage/estilist.do","/manufacpage/prodlist.do","/manufacpage/estilist_more_w.do","/manufacpage/estilist_more_ing.do","/manufacpage/estilist_more_de.do","/com_manufacpage/com_estilist.do" },method = RequestMethod.GET)
		private ModelAndView prodlist(PageVO pagevo, @RequestParam(value="nowPage", required = false)String nowPage, @RequestParam(value  = "cntPerPage", required = false)String cntPerPage, HttpServletRequest request, HttpServletResponse response) throws Exception{
			
				request.setCharacterEncoding("utf-8");
				response.setContentType("html/text;charset=utf-8");
				String viewName = (String)request.getAttribute("viewName");
				int total = manufacservice.listCount();
				if(nowPage == null && cntPerPage == null) {
					nowPage = "1";
					cntPerPage = "10";
				}else if(nowPage == null) {
					nowPage = "1";
				}else if(cntPerPage == null) {
					cntPerPage = "10";
				}
				System.out.println(nowPage);
				pagevo = new PageVO(total, Integer.parseInt(nowPage),Integer.parseInt(cntPerPage));
				List<ManufacVO> prodlist = manufacservice.listprod(pagevo);
//				List<ManufacVO> conlist = manufacservice.listcon(pagevo);
				List<ManufacVO> estilist = manufacservice.listesti(pagevo);
				ModelAndView mav = new ModelAndView();
				mav.addObject("prodlist",prodlist);
//				mav.addObject("conlist",conlist);
				mav.addObject("estilist",estilist);
				mav.addObject("pagevo",pagevo);
				System.out.println("estiList: "+estilist);
		
				
				return mav;
		}
		@RequestMapping(value="/manufacpage/estilist_del.do" , method = RequestMethod.GET)
		public ModelAndView deletestatus(@RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
			request.setCharacterEncoding("utf-8");
			System.out.println("delete NO: "+no);
			manufacservice.deleteesti(no);
			ModelAndView mav = new ModelAndView("redirect:/manufacpage/estilist.do");
			return mav;
		}
		@RequestMapping(value = {"/manufacpage/estilist_updatestatus.do"}, method = RequestMethod.GET)
		public ModelAndView updatestatus(@RequestParam("quotestatus") int quotestatus, @RequestParam("no") int no, HttpServletRequest request, HttpServletResponse response)throws Exception{
			request.setCharacterEncoding("utf-8");
			manufacservice.updatestatus(quotestatus,no);
			ModelAndView mav = new ModelAndView("redirect:/manufacpage/estilist.do");
	
			return mav;
			
		}
}
