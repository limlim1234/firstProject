package com.yedam.test;

public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		
	}
	
	public String getTitle() { return title; }
	public String getContent() { return content; }

@Override
public String toString() {
   return "제목" + title + "내용" + content;
}
}