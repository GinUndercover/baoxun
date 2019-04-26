package com.example.demo.dao;

import com.example.demo.po.menu;

import java.util.List;

public interface IMenu {
    List<menu> getmenu(int id);
    List<menu> getall();
}
