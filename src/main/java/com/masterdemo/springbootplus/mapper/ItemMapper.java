package com.masterdemo.springbootplus.mapper;

import com.masterdemo.springbootplus.pojo.Item;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: 1
 * @author: chensong52
 * @create: 2018-07-23 12:09
 **/
public interface ItemMapper {
    //增加
    Item addItem(Item item);

    //删除
    Long deleteItem(@Param("id") int id);

    //修改
    Long updateItem(Item item);

    //按id查
    Item getItemById(@Param("id") int id);

    //查List
    List<Item> getItem();
}
