package com.wuzhiqiang.main.domain;

import java.io.Serializable;
/**
 * 章节
 * @author wuzhq
 *
 */
public class Chapter implements Serializable{
	private static final long serialVersionUID = 8240103173290490891L;
	private Long id ;
	private String name;
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
