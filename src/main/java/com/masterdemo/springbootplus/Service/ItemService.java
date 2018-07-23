package com.masterdemo.springbootplus.Service;

import com.masterdemo.springbootplus.pojo.Item;

import java.util.List;

/**
 * @description: ItemService
 * @author: chensong52
 * @create: 2018-07-23 12:05
 **/
public interface ItemService {
     //增加
    Item addItem(Item item);

    //删除
    Long deleteItem(int id);

    //修改
    Long updateItem(Item item);

    //按id查
    Item getItemById(int id);

    //查List
    List<Item> getItem();

}
