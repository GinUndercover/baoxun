package com.example.demo.serverce;

import com.example.demo.po.menu;

import java.util.List;

public interface IMenuServerce {
    List<menu> getmenu(int id);
    List<menu> getall();
}
