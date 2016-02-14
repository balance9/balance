/**
 * 
 */
package com.balance.common.auth.user.dto;

/**
 * @author duanp
 * 
 */
public class Pagination {

	private long count = 0;
	private long pages = 0;
	private long start = 0;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public long getCurrent() {
		return current;
	}

	public void setCurrent(long current) {
		this.current = current;
	}

	private long limit = 0;
	private long current = 0;

}
