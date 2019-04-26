package com.example.demo.serverce;

import com.example.demo.dao.IMenu;
import com.example.demo.po.menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServerce implements IMenuServerce {

    @Resource
    private IMenu iMenu;

    @Override
    public List<menu> getmenu(int id) {
        return iMenu.getmenu(id);
    }

    @Override
    public List<menu> getall() {
        return iMenu.getall();
    }
}
