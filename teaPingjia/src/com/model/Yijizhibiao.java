package com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Yijizhibiao generated by MyEclipse Persistence Tools
 */

public class Yijizhibiao implements java.io.Serializable
{

	// Fields

	private Integer yijizhibiaoId;

	private String yijizhibiaoName;

	private String yijizhibiaoNeirong;

	private Double yijizhibiaoQuanzhong;

	private Double yijizhibiaoFenshu;

	private String del;
	
	private List erjizhibiaoList=new ArrayList();

	// Constructors

	/** default constructor */
	public Yijizhibiao()
	{
	}

	/** full constructor */
	public Yijizhibiao(String yijizhibiaoName, String yijizhibiaoNeirong,
			Double yijizhibiaoQuanzhong, Double yijizhibiaoFenshu, String del)
	{
		this.yijizhibiaoName = yijizhibiaoName;
		this.yijizhibiaoNeirong = yijizhibiaoNeirong;
		this.yijizhibiaoQuanzhong = yijizhibiaoQuanzhong;
		this.yijizhibiaoFenshu = yijizhibiaoFenshu;
		this.del = del;
	}

	// Property accessors

	public Integer getYijizhibiaoId()
	{
		return this.yijizhibiaoId;
	}

	public List getErjizhibiaoList()
	{
		return erjizhibiaoList;
	}

	public void setErjizhibiaoList(List erjizhibiaoList)
	{
		this.erjizhibiaoList = erjizhibiaoList;
	}

	public void setYijizhibiaoId(Integer yijizhibiaoId)
	{
		this.yijizhibiaoId = yijizhibiaoId;
	}

	public String getYijizhibiaoName()
	{
		return this.yijizhibiaoName;
	}

	public void setYijizhibiaoName(String yijizhibiaoName)
	{
		this.yijizhibiaoName = yijizhibiaoName;
	}

	public String getYijizhibiaoNeirong()
	{
		return this.yijizhibiaoNeirong;
	}

	public void setYijizhibiaoNeirong(String yijizhibiaoNeirong)
	{
		this.yijizhibiaoNeirong = yijizhibiaoNeirong;
	}

	public Double getYijizhibiaoQuanzhong()
	{
		return this.yijizhibiaoQuanzhong;
	}

	public void setYijizhibiaoQuanzhong(Double yijizhibiaoQuanzhong)
	{
		this.yijizhibiaoQuanzhong = yijizhibiaoQuanzhong;
	}

	public Double getYijizhibiaoFenshu()
	{
		return this.yijizhibiaoFenshu;
	}

	public void setYijizhibiaoFenshu(Double yijizhibiaoFenshu)
	{
		this.yijizhibiaoFenshu = yijizhibiaoFenshu;
	}

	public String getDel()
	{
		return this.del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

}