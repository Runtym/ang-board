package com.ang.back.vo;

public class AngBoard {

	private int num;
	private String title;
	private String content;
	private String wdate;
	private String writer;
	private AngUser au;
	
	public AngUser getAu() {
		return au;
	}
	public void setAu(AngUser au) {
		this.au = au;
	}
	private int cnt;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "AngBoard [num=" + num + ", title=" + title + ", content=" + content + ", wdate=" + wdate + ", writer="
				+ writer + ", cnt=" + cnt + "]";
	}
	
	
}
