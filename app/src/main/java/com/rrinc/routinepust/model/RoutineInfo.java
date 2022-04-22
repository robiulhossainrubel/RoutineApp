package com.rrinc.routinepust.model;

public class RoutineInfo {

    private String rtID,clsTitl, clsCode, clsTime,clsTech,clsRoom;

    public RoutineInfo() {
    }

    public RoutineInfo(String rtID, String clsTitl, String clsCode, String clsTime, String clsTech, String clsRoom) {
        this.rtID = rtID;
        this.clsTitl = clsTitl;
        this.clsCode = clsCode;
        this.clsTime = clsTime;
        this.clsTech = clsTech;
        this.clsRoom = clsRoom;
    }

    public String getRtID() {
        return rtID;
    }

    public void setRtID(String rtID) {
        this.rtID = rtID;
    }

    public String getClsTitl() {
        return clsTitl;
    }

    public void setClsTitl(String clsTitl) {
        this.clsTitl = clsTitl;
    }

    public String getClsCode() {
        return clsCode;
    }

    public void setClsCode(String clsCode) {
        this.clsCode = clsCode;
    }

    public String getClsTime() {
        return clsTime;
    }

    public void setClsTime(String clsTime) {
        this.clsTime = clsTime;
    }

    public String getClsTech() {
        return clsTech;
    }

    public void setClsTech(String clsTech) {
        this.clsTech = clsTech;
    }

    public String getClsRoom() {
        return clsRoom;
    }

    public void setClsRoom(String clsRoom) {
        this.clsRoom = clsRoom;
    }
}
