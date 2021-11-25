package com.dcs.lib;

public class Token {
    private String  accessToken;
    private int     tokenExpires;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getTokenExpires() {
        return tokenExpires;
    }

    public void setTokenExpires(int tokenExpires) {
        this.tokenExpires = tokenExpires;
    }
}
