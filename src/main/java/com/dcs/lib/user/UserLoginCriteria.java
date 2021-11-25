package com.dcs.lib.user;

public class UserLoginCriteria {
    private int      userId;
    private String   userName;
    private String   userPassword;
    private int      userRole;
    private String   userIpAddress;
    private String   userSessionId;
    private int      checkSession;
    private String   lang;

    public UserLoginCriteria(int userId, String userName, String userPassword,  String userIpAddress, String userSessionId, int checkSession, String lang) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userIpAddress = userIpAddress;
        this.userSessionId = userSessionId;
        this.checkSession = checkSession;
        this.lang = lang;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getUserIpAddress() {
        return userIpAddress;
    }

    public void setUserIpAddress(String userIpAddress) {
        this.userIpAddress = userIpAddress;
    }

    public String getUserSessionId() {
        return userSessionId;
    }

    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

    public int getCheckSession() {
        return checkSession;
    }

    public void setCheckSession(int checkSession) {
        this.checkSession = checkSession;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
