package com.example.demo.po;

import java.util.List;

public class menu {

    /**
     * 菜单编号
     */
    private Integer menuId;

    /**
     * 资源标识
     */
    private String resourceId;

    /**
     * 菜单code-前台用
     */
    private String name;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单url-
     */
    private String path;

    /**
     * 上级菜单编号
     */
    private Integer pMenuId;

    /**
     * 上级菜单名称
     */
    private String pMenuName;

    /**
     * 菜单图片-
     */
    private String icon;

    /**
     * 菜单类型
     */
    private String menuType;

    /**
     * iframe url
     */
    private String iframe;

    /**
     * 应用系统编码
     */
    private String appId;

    /**
     * 应用系统名称
     */
    private String appName;

    /**
     * 排序号
     */
//    private Integer sortOrd;

    /**
     * 是否有效
     */
//    private Integer isUsed = 1;

    /**
     * 前端资源路径-
     */
    private String component;

    /**
     * 对应页面pageCode-
     */
    private String pageCode;

    /**
     * 是否隐藏菜单
     */
    private Boolean hideInMenu;

    /**
     * 下级菜单集合-
     */
//    private List<MenuResource_newDTO> subMenuList;
    private List<menu> routes;

    @Override
    public String toString() {
        return "menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", pMenuId=" + pMenuId +
                ", routes=" + routes +
                '}';
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getpMenuId() {
        return pMenuId;
    }

    public void setpMenuId(Integer pMenuId) {
        this.pMenuId = pMenuId;
    }

    public String getpMenuName() {
        return pMenuName;
    }

    public void setpMenuName(String pMenuName) {
        this.pMenuName = pMenuName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getIframe() {
        return iframe;
    }

    public void setIframe(String iframe) {
        this.iframe = iframe;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }

    public Boolean getHideInMenu() {
        return hideInMenu;
    }

    public void setHideInMenu(Boolean hideInMenu) {
        this.hideInMenu = hideInMenu;
    }

    public List<menu> getRoutes() {
        return routes;
    }

    public void setRoutes(List<menu> routes) {
        this.routes = routes;
    }
}
