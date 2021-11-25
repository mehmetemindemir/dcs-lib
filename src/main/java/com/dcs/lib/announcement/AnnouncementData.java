package com.dcs.lib.announcement;


public class AnnouncementData {
    private int annId;
    private String messageText;
    private String userName;
    private String createDate;
    private String status;
    private String airport;
    private String type;
    private String headerText;
    private String flightType;
    private int line;

    public int getAnnId() {
        return annId;
    }

    public void setAnnId(int annId) {
        this.annId = annId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
