package com.henu.party.service;

import com.henu.party.bean.Exam;
import com.henu.party.bean.ItemBank;

import java.util.List;

public interface ItemBankService {
    /**
     * 查询全部题
     * @return
     */
    public List<ItemBank> selectAllBank();

    /**
     * 通过id查询题
     * @param id
     * @return
     */
    public ItemBank selectBankbyId(int id);

    /**
     * 通过内容查询
     * @param content
     * @return
     */
    public List<ItemBank> selectBankbyContent(String content);

    /**
     * 插入题
     * @param itembank
     */
    public void insertBank(ItemBank itembank);

    /**
     * 删除题
     * @param id
     */
    public void delBank(int id);

    /**
     * 修改题
     * @param itemBank
     */
    public void updateBank(ItemBank itemBank);

}
