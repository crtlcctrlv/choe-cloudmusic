package cn.matsu.choe.cloudmusic.datasync.entity.vo;

import java.util.List;

public class ArtistCategoryVO {

  private Integer categoryId;

  private Integer parentId;

  private String name;

  private List<ArtistCategoryVO> subList;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ArtistCategoryVO> getSubList() {
    return subList;
  }

  public void setSubList(List<ArtistCategoryVO> subList) {
    this.subList = subList;
  }

}
