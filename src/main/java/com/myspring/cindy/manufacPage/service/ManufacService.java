package com.myspring.cindy.manufacPage.service;

import java.util.List;

import com.myspring.cindy.manufacPage.vo.ManufacVO;
import com.myspring.cindy.startuppage.vo.PageVO;

public interface ManufacService {

	int listCount();

	List<ManufacVO> listesti(PageVO pagevo);

	List<ManufacVO> listprod(PageVO pagevo);

	int deleteesti(int no) throws Exception;

}
