package com.risker.allshared.param;

import com.risker.allshared.constant.PageContant;

/**
 * Created by myz on 16/8/28.
 * 分页参数相关设置、以及默认值
 */
public abstract class PageParam {

    //页面传递
    private int curPage = PageContant.DEFAULT_CURRENT_PAGE; // 当前页

    private int pageSize = PageContant.DEFAULT_PAGE_SIZE; // 每页多少行

    //查询库得到
    private int totalRow = 0;

    //计算
    private int start =0;// 当前页起始行

    private int end = 0;// 结束行

    private int totalPage = 0; // 共多少页

    private PageParam(){
        setDefaultCurPage();
        setDefaultPageSize();
    }

    public void setTotalRow(int totalRow){
        this.totalRow = totalRow;
    }

    private void setDefaultCurPage() {
        if (this.curPage < PageContant.DEFAULT_CURRENT_PAGE) {
            this.curPage = PageContant.DEFAULT_CURRENT_PAGE;
            return;
        }
    }

    private void setDefaultPageSize(){
        if(this.pageSize < 0 ){
            this.pageSize = PageContant.DEFAULT_PAGE_SIZE;
        }
    }

    public int getStart() {

        this.start = pageSize * (curPage - 1);
        return this.start;
    }

    public int getEnd() {
        this.end = start + pageSize > totalRow ? totalRow : start + pageSize;
        return this.end;
    }

    public int getTotalPage() {
        return (totalRow + pageSize)/pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public int getCurPage() {
        return curPage;
    }

}
