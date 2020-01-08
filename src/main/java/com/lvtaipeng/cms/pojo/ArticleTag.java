package com.lvtaipeng.cms.pojo;

public class ArticleTag {

	/** 文章Id **/
	private Integer aid;
	/** 标签Id **/
	private Integer tid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public ArticleTag() {
		super();
	}
	public ArticleTag(Integer aid, Integer tid) {
		super();
		this.aid = aid;
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "ArticleTag [aid=" + aid + ", tid=" + tid + "]";
	}

	
}
