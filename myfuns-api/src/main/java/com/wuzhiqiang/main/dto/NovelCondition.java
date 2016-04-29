package com.wuzhiqiang.main.dto;

import java.io.Serializable;

import com.wuzhiqiang.main.domain.Novel;

public class NovelCondition  implements Serializable{
	private static final long serialVersionUID = 8240103173290490895L;
	private Novel novel;
	private String name;
	private Long id ;
	public Novel getNovel() {
		return novel;
	}
	public void setNovel(Novel novel) {
		this.novel = novel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
