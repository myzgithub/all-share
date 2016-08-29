package com.risker.allshared.model.paging;

import com.risker.allshared.model.ResultModel;
import com.risker.allshared.param.PageParam;

import java.util.List;

/**
 * Created by myz on 16/8/29.
 * 1.页面给定条件参数[currentPage和pageSize]
 * 2.后台查询总记录数和具体Model
 * 3.给前台显示相应的分页信息
 */
public class PagingResultModel<T> extends ResultModel<List<T>> {

    private int totalCount = 0;//查询库设置值

    private PageParam pageParam;//页面参数带入

    private int currentPage = 0;//当前页

    private int pageSize = 0;//每页大小

    private int totalPage = 0;//总页数

    public void setPageShowInfo(PageParam pageParam){
        this.currentPage = pageParam.getCurPage();
        this.pageSize = pageParam.getPageSize();
        this.totalPage = pageParam.getTotalPage();
    }

    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 从库中查询
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        pageParam.setTotalRow(totalCount);//获取起始行和结束行
    }

    public PageParam getPageParam() {
        return pageParam;
    }

    public void setPageParam(PageParam pageParam) {
        this.pageParam = pageParam;
    }
}
