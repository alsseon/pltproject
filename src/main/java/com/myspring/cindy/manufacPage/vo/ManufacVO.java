package com.myspring.cindy.manufacPage.vo;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component("manufacvo")
public class ManufacVO {
	String compname;
	Date reqquote;
	int orderstatus;
	int quotestatus;
	Date reqorder;
	int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public Date getReqquote() {
		return reqquote;
	}
	public void setReqquote(Date reqquote) {
		this.reqquote = reqquote;
	}
	public int getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}
	public int getQuotestatus() {
		return quotestatus;
	}
	public void setQuotestatus(int quotestatus) {
		this.quotestatus = quotestatus;
	}
	public Date getReqorder() {
		return reqorder;
	}
	public void setReqorder(Date reqorder) {
		this.reqorder = reqorder;
	}
	@Override
	public String toString() {
		return "ManufacVO [compname=" + compname + ", reqquote=" + reqquote + ", orderstatus=" + orderstatus
				+ ", quotestatus=" + quotestatus + ", reqorder=" + reqorder + ", no=" + no + "]";
	}
}
