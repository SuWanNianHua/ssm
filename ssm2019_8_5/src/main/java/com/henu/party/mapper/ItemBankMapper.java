package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.ItemBank;



public interface ItemBankMapper {

	/**
	 * 插入ItemBank数据
	 * @param itemBank
	 */
	public void insertItemBank(ItemBank itemBank);
	
	/**
	 * 根据id号查询
	 * @param id
	 * @return ItemBank
	 */
	public ItemBank selectByIdItemBank(Integer id);
	
	/**
	 * 查询全部
	 * @return ItemBank集合
	 */
	public List<ItemBank> selectAllItemBank();
	
	/**
	 * 批量删除
	 * @param ids 指定传入的id集合
	 */
	public void batchDeleteByIdItemBank(@Param("ids")String[] ids);
	
	public List<ItemBank> searchRowItemBank(@Param("num1")int num1,@Param("num2")int num2);
	
	public int numberItemBank();

	/**
	 * 通过内容查询
	 * @param itemContent
	 * @return
	 */
	public List<ItemBank> selectBankbyContent(@Param("itemContent") String itemContent);

	/**
	 * 通过id删除
	 * @param id
	 */
	public void delBank(int id);

	/**
	 * 修改内容
	 * @param itemBank
	 */
	public void updateBank(ItemBank itemBank);
}
