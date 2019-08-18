package com.henu.party.service.impl;

import com.henu.party.bean.ItemBank;
import com.henu.party.mapper.ItemBankMapper;
import com.henu.party.service.ItemBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ItemBankService")
public class ItemBankServiceImpl implements ItemBankService {
    @Autowired
    public ItemBankMapper itemBankMapper;


    @Override
    public List<ItemBank> selectAllBank() {
        return itemBankMapper.selectAllItemBank();
    }

    @Override
    public ItemBank selectBankbyId(int id) {
        return itemBankMapper.selectByIdItemBank(id);
    }

    @Override
    public List<ItemBank> selectBankbyContent(String content) {
        return itemBankMapper.selectBankbyContent(content);
    }

    @Override
    public void insertBank(ItemBank itembank) {
        itemBankMapper.insertItemBank(itembank);
    }

    @Override
    public void delBank(int id) {
        itemBankMapper.delBank(id);
    }

    @Override
    public void updateBank(ItemBank itemBank) {
        itemBankMapper.updateBank(itemBank);
    }
}
