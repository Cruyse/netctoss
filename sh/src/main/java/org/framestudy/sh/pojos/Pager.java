package org.framestudy.sh.pojos;

import java.util.List;

public class Pager {

	private int page;
	private int rows;
	
	private long total;
	private long totalPage;
	private List<?> datas;
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pager(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		totalPage = (total % rows == 0) ? (total /rows) : (total /rows) + 1;
		this.total = total;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	
	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", total=" + total + ", totalPage=" + totalPage + ", datas="
				+ datas + "]";
	}
}
