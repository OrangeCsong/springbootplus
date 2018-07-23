package com.masterdemo.springbootplus.Controller;

import com.masterdemo.springbootplus.Service.ItemService;
import com.masterdemo.springbootplus.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 控制
 * @author: chensong52
 * @create: 2018-07-23 12:12
 **/
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    //增加
    @RequestMapping(value = "/api/item",method = RequestMethod.POST)
   public void addItem(@RequestBody Item item){
       itemService.addItem(item);
   }

   //删除
    @RequestMapping(value = "/api/item/{id}",method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable("id") int id){
        itemService.deleteItem(id);
    }

    //修改
    @RequestMapping(value = "/api/item",method = RequestMethod.PUT)
    public void updateItem(@RequestBody Item item){
        itemService.updateItem(item);
    }

    //id查
    @RequestMapping(value = "/api/item/{id}",method = RequestMethod.GET)
    public Item getItemById(@PathVariable("id") int id){
        return itemService.getItemById(id);
    }

    //list查
    @RequestMapping(value = "/api/item",method = RequestMethod.GET)
    public List<Item> getItemList(){
        return itemService.getItem();
    }
}

