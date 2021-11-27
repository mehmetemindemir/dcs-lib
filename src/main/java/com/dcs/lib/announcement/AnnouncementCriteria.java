package com.dcs.lib.announcement;

public  class AnnouncementCriteria {
    String airport;
    String searchType;
    String annId;
    String type;
    String flightType;
    int companyId;

    public AnnouncementCriteria() {
    }

    public AnnouncementCriteria(String airport, String searchType, String annId, String type, String flightType, int companyId) {
        this.airport = airport;
        this.searchType = searchType;
        this.annId = annId;
        this.type = type;
        this.flightType = flightType;
        this.companyId = companyId;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getAnnId() {
        return annId;
    }

    public void setAnnId(String annId) {
        this.annId = annId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
