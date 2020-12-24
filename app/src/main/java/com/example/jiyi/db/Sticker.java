package db;

import java.util.Date;
import java.util.List;

//表示便利贴的类
public class Sticker {
    int stickerID;
    int userID;
    Date sdate; // 发布时间
    String place; //发布地点
    String stickerText;
    int isLike;
    List tag;

    public int getStickerID() {
        return stickerID;
    }

    public void setStickerID(int stickerID) {
        this.stickerID = stickerID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
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

    public int getIsLike() {
        return isLike;
    }

    public void setIsLike(int isLike) {
        this.isLike = isLike;
    }

    public List getTag() {
        return tag;
    }

    public void setTag(List tag) {
        this.tag = tag;
    }

    public Sticker() {
    }

    public Sticker(int stickerID, int userID, Date sdate, String place, String stickerText, int isLike, List tag) {
        this.stickerID = stickerID;
        this.userID = userID;
        this.sdate = sdate;
        this.place = place;
        this.stickerText = stickerText;
        this.isLike = isLike;
        this.tag = tag;
    }
}


