package com.kgr.domain;

public class RouteRequest {
    private String baseUpc;
    private String consumerUpc;
    private String subDept;
    private Integer aisleNumber;
    private String aisleSide;
    private Integer bayNumber;
    private Integer shelfNumber;
    private Integer positionNumber;

    public RouteRequest() {
    }

    public RouteRequest(String baseUpc, String consumerUpc, String subDept, Integer aisleNumber, String aisleSide, Integer bayNumber, Integer shelfNumber, Integer positionNumber) {
        this.baseUpc = baseUpc;
        this.consumerUpc = consumerUpc;
        this.subDept = subDept;
        this.aisleNumber = aisleNumber;
        this.aisleSide = aisleSide;
        this.bayNumber = bayNumber;
        this.shelfNumber = shelfNumber;
        this.positionNumber = positionNumber;
    }

    public String getBaseUpc() {
        return baseUpc;
    }

    public void setBaseUpc(String baseUpc) {
        this.baseUpc = baseUpc;
    }

    public String getConsumerUpc() {
        return consumerUpc;
    }

    public void setConsumerUpc(String consumerUpc) {
        this.consumerUpc = consumerUpc;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String subDept) {
        this.subDept = subDept;
    }

    public Integer getAisleNumber() {
        return aisleNumber;
    }

    public void setAisleNumber(Integer aisleNumber) {
        this.aisleNumber = aisleNumber;
    }

    public String getAisleSide() {
        return aisleSide;
    }

    public void setAisleSide(String aisleSide) {
        this.aisleSide = aisleSide;
    }

    public Integer getBayNumber() {
        return bayNumber;
    }

    public void setBayNumber(Integer bayNumber) {
        this.bayNumber = bayNumber;
    }

    public Integer getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(Integer shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    @Override
    public String toString() {
        return "RouteRequest{" +
                "baseUpc='" + baseUpc + '\'' +
                ", consumerUpc='" + consumerUpc + '\'' +
                ", subDept='" + subDept + '\'' +
                ", aisleNumber=" + aisleNumber +
                ", aisleSide='" + aisleSide + '\'' +
                ", bayNumber=" + bayNumber +
                ", shelfNumber=" + shelfNumber +
                ", positionNumber=" + positionNumber +
                '}';
    }
}
