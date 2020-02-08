package cn.matsu.choe.cloudmusic.web.entity.po;

import java.util.Date;

public class Artist {
    private Integer id;

    private Integer artistId;

    private String name;

    private String alias;

    private String category;

    private String initial;

    private String picUrl;

    private String briefDesc;

    private Short musicSize;

    private Short albumSize;

    private Short mvSize;

    private Date createTime;

    private Date updateTime;

    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial == null ? null : initial.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc == null ? null : briefDesc.trim();
    }

    public Short getMusicSize() {
        return musicSize;
    }

    public void setMusicSize(Short musicSize) {
        this.musicSize = musicSize;
    }

    public Short getAlbumSize() {
        return albumSize;
    }

    public void setAlbumSize(Short albumSize) {
        this.albumSize = albumSize;
    }

    public Short getMvSize() {
        return mvSize;
    }

    public void setMvSize(Short mvSize) {
        this.mvSize = mvSize;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}