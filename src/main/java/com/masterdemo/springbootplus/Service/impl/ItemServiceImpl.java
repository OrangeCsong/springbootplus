package com.masterdemo.springbootplus.Service.impl;

import com.masterdemo.springbootplus.Service.ItemService;
import com.masterdemo.springbootplus.mapper.ItemMapper;
import com.masterdemo.springbootplus.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 实现类
 * @author: chensong52
 * @create: 2018-07-23 12:09
 **/
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item addItem(Item item) {
        return itemMapper.addItem(item);
    }

    @Override
    public Long deleteItem(int id) {
        return itemMapper.deleteItem(id);
    }

    @Override
    public Long updateItem(Item item) {
        return itemMapper.updateItem(item);
    }

    @Override
    public Item getItemById(int id) {
        return itemMapper.getItemById(id);
    }

    @Override
    public List<Item> getItem() {
        return itemMapper.getItem();
    }
}
