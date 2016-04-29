package com.wuzhiqiang.main.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 小说
 * @author wuzhq
 *
 */
public class Novel   implements Serializable{
	private static final long serialVersionUID = 8240103173290490895L;
	private Long id ;
	private String name;
	private String author;
	private List<Chapter> chapters;
	private String createUser;
	private Timestamp createTime;
	
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	

}
