package cn.matsu.choe.cloudmusic.datasync.entity.po;

import java.util.Date;

public class Album {
  private Integer id;

  private Integer albumId;

  private String name;

  private String alias;

  private Integer artistId;

  private String artistName;

  private String company;

  private String picUrl;

  private Short size;

  private Integer commentCount;

  private Integer shareCount;

  private String commentThreadId;

  private Date publishTime;

  private Date createTime;

  private Date updateTime;

  private String description;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getAlbumId() {
    return albumId;
  }

  public void setAlbumId(Integer albumId) {
    this.albumId = albumId;
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

  public Integer getArtistId() {
    return artistId;
  }

  public void setArtistId(Integer artistId) {
    this.artistId = artistId;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName == null ? null : artistName.trim();
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company == null ? null : company.trim();
  }

  public String getPicUrl() {
    return picUrl;
  }

  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl == null ? null : picUrl.trim();
  }

  public Short getSize() {
    return size;
  }

  public void setSize(Short size) {
    this.size = size;
  }

  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public Integer getShareCount() {
    return shareCount;
  }

  public void setShareCount(Integer shareCount) {
    this.shareCount = shareCount;
  }

  public String getCommentThreadId() {
    return commentThreadId;
  }

  public void setCommentThreadId(String commentThreadId) {
    this.commentThreadId = commentThreadId == null ? null : commentThreadId.trim();
  }

  public Date getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(Date publishTime) {
    this.publishTime = publishTime;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description == null ? null : description.trim();
  }
}
