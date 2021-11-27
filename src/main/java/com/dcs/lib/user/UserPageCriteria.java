package com.dcs.lib.user;

public class UserPageCriteria {
    int pageId;
    int userId;
    int isShow;
    int userType;

    public UserPageCriteria() {
    }

    public UserPageCriteria(int pageId, int userId, int isShow, int userType) {
        this.pageId = pageId;
        this.userId = userId;
        this.isShow = isShow;
        this.userType = userType;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
