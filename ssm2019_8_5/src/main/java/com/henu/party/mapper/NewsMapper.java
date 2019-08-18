package com.henu.party.mapper;

import java.util.List;

import com.henu.party.bean.PartyNews;


public interface NewsMapper {
	/*
	 * 查找全部新闻
	 */
	public List<PartyNews> selectAllNews(int start,int ps) throws Exception;
	/*
	 * 查找最新新闻
	 */
	public List<PartyNews> selectNewNews(int num)throws Exception;
	/*
	 * 分类查找
	 */
	public List<PartyNews> selectSomeNews(String type) throws Exception;
	
	/*
	 * 插入一条新闻
	 */
	public void insertNew(PartyNews partyNew) throws Exception;
	
	/*
	 * 删除勾选新闻
	 */
	public void deleteNews(String[] newIds) throws Exception;
	/*
	 * 按类型查询
	 */
	public List<PartyNews> query(String type) throws Exception;
    /*
     * 按类页码查找	
     */
	public List<PartyNews> findByPage(String type,int start,int ps) throws Exception;
	/*
	 * 相关记录条数(带条件)
	 */
	public int findCount(String type)throws Exception;
	/*
	 * 总记录条数(不带条件)
	 */
	public int findAllCount()throws Exception;
}
