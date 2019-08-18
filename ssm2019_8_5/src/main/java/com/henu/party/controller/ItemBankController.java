package com.henu.party.controller;

import com.henu.party.bean.ItemBank;
import com.henu.party.service.ItemBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemBankController {
    @Autowired
    private ItemBankService itemBankService;

    /**
     * 查找所有题
     * @return
     */
    @RequestMapping("/item/selectitem")
    public List<ItemBank> SelectAll() {
        return  itemBankService.selectAllBank();
    }

    /**
     * 插入数据
     * @param itemBank
     */
    @RequestMapping("/item/insertitem")
    public void insertItem(ItemBank itemBank) {
        itemBankService.insertBank(itemBank);
    }

    /**
     * 通过id查询
     * @param id
     * @return
     */
    @RequestMapping("/item/selectbyid")
    public ItemBank selectbyid(int id){
        return itemBankService.selectBankbyId(id);
    }

    /***
     * 通过内容查找
     * @param content
     * @return
     */
    @RequestMapping("/item/selectbycontent")
    public List<ItemBank> selectbycontent(String content){
        return itemBankService.selectBankbyContent(content);
    }

    /**
     * 更新内容
     * @param itemBank
     */
    @RequestMapping("/item/updatebank")
    public void updatebank(ItemBank itemBank){
        itemBankService.updateBank(itemBank);
    }

    /***
     * 删除内容
     * @param id
     */
    @RequestMapping("/item/delbank")
    public void delbank(Integer id){
        System.out.println(id);
        itemBankService.delBank(id);
    }

}
