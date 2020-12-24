package com.example.jiyi.db;

import java.util.Date;
import java.util.List;

//表示便利贴的类,简约版
public class Sticker {
    int stickerID;
    String sdate; // 发布时间
    String place; //发布地点
    String stickerText;
    String tag; // SQLite 里不能直接保存为List,后期考虑用逗号隔开的字符串来保存！！！！
    int year; //手动选择的年
    int month;
    int day;

    public int getStickerID() {
        return stickerID;
    }

    public void setStickerID(int stickerID) {
        this.stickerID = stickerID;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStickerText() {
        return stickerText;
    }

    public void setStickerText(String stickerText) {
        this.stickerText = stickerText;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Sticker() {
    }

    public Sticker(int stickerID, String sdate, String place, String stickerText, String tag, int year, int month, int day) {
        this.stickerID = stickerID;
        this.sdate = sdate;
        this.place = place;
        this.stickerText = stickerText;
        this.tag = tag;
        this.year = year;
        this.month = month;
        this.day = day;
    }
}


