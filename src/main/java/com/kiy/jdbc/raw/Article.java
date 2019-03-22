package com.kiy.jdbc.raw;

public class Article {
	String articleId;
	String title;
	String content;
	String userId;
	String name;
	String cdate;
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getArticleId() {
		return articleId;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getCdate() {
		return cdate;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", userId=" + userId
				+ ", name=" + name + ", cdate=" + cdate + "]";
	}
}

