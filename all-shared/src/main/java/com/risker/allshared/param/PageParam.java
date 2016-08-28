package com.risker.allshared.param;

import com.risker.allshared.constant.PageContant;

/**
 * Created by myz on 16/8/28.
 * 分页参数相关设置、以及默认值
 */
public abstract class PageParam {

    protected int curPage = PageContant.DEFAULT_CURRENT_PAGE; // 当前页

    protected int pageSize = PageContant.DEFAULT_PAGE_SIZE; // 每页多少行

    protected int totalRow; // 共多少行

    protected int start;// 当前页起始行

    protected int end;// 结束行

    protected int totalPage; // 共多少页

    public int getCurPage() {
        return curPage;
    }

    /**
     * 通过设置curPage来计算end和start
     * @param curPage
     */
    protected void setCurPage(int curPage) {
        if (curPage < PageContant.DEFAULT_CURRENT_PAGE) {
            curPage = PageContant.DEFAULT_CURRENT_PAGE;
            return;
        }
        start = pageSize * (curPage - 1);
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
        this.curPage = curPage;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {

        return end;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRow() {
        return totalRow;
    }

    /**
     * 设置总页数
     * 计算end
     * @param totalRow
     */
    protected void setTotalRow(int totalRow) {
        totalPage = (totalRow + pageSize - 1) / pageSize;
        this.totalRow = totalRow;
        if (totalPage < curPage) {
            curPage = totalPage;
            start = pageSize * (curPage - 1);
            end = totalRow;
        }
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
    }

    public int getTotalPage() {

        return this.totalPage;
    }




}
