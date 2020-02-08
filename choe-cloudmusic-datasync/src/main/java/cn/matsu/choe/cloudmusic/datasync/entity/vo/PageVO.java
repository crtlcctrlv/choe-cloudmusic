package cn.matsu.choe.cloudmusic.datasync.entity.vo;

import java.util.List;
import cn.matsu.choe.cloudmusic.datasync.util.PageUtil;

public class PageVO<T> {

  private static final int DEFAULT_PAGE_SIZE = 10;

  private long total;

  private int pages;

  private int pageNum;

  private int pageSize;

  private List<T> list;

  // ---------------------------------------------------------- Constructor start
  public PageVO() {}

  public PageVO(int pageNum, int pageSize, long total, List<T> list) {
    this.pageNum = pageNum <= 0 ? 0 : pageNum;
    this.pageSize = pageSize <= 0 ? DEFAULT_PAGE_SIZE : pageSize;

    this.total = total;
    this.pages = PageUtil.totalPage((int) total, pageSize);

    this.list = list;
  }
  // ---------------------------------------------------------- Constructor end

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

}
