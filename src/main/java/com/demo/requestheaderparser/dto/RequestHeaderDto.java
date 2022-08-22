package com.demo.requestheaderparser.dto;

public class RequestHeaderDto {

    private String ipAddress;
    private String language;
    private String software;

    public RequestHeaderDto() {

    }

    public RequestHeaderDto(String ipAddress, String language, String software) {
        this.ipAddress = ipAddress;
        this.language = language;
        this.software = software;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

}
