package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("자바", "아아아"));
		list.add(new Board("자바", "이이이"));
		list.add(new Board("자바", "오오오"));
		return null;
	}

}

//이름 자바 내용 자바자바자바