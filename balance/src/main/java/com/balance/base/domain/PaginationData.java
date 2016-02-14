/**
 * 
 */
package com.balance.base.domain;

import java.util.List;

/**
 * @author duanp
 * 
 */
public class PaginationData<E> {
	private int current = 0;
	private int rowCount = 0;
	private List<E> rows = null;
	private long total = 0;
	private int pageCount = 0;

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public List<E> getRows() {
		return rows;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

}
