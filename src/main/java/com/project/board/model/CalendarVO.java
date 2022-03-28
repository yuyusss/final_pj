package com.project.board.model;

import java.util.Date;

public class CalendarVO {
    private int calNo;
    private String calTitle;
    private String calDetail;
    private String calStart;
    private String calEnd;
    private String calURL;

    public int getCalNo() {
        return calNo;
    }

    public void setCalNo(int calNo) {
        this.calNo = calNo;
    }

    public String getCalTitle() {
        return calTitle;
    }

    public void setCalTitle(String calTitle) {
        this.calTitle = calTitle;
    }

    public String getCalDetail() {
        return calDetail;
    }

    public void setCalDetail(String calDetail) {
        this.calDetail = calDetail;
    }

    public String getCalStart() {
        return calStart;
    }

    public void setCalStart(String calStart) {
        this.calStart = calStart;
    }

    public String getCalEnd() {
        return calEnd;
    }

    public void setCalEnd(String calEnd) {
        this.calEnd = calEnd;
    }

    public String getCalURL() {
        return calURL;
    }

    public void setCalURL(String calURL) {
        this.calURL = calURL;
    }

    @Override
    public String toString() {
        return "CalendarVO{" +
                "calNo=" + calNo +
                ", calTitle='" + calTitle + '\'' +
                ", calDetail='" + calDetail + '\'' +
                ", calStart=" + calStart +
                ", calEnd=" + calEnd +
                ", calURL='" + calURL + '\'' +
                '}';
    }
}
