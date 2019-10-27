package com.koreait.data;

public class Singer {

	// Field
	private String name;
	private Song song;
	
	// Constructor
	public Singer(String name, Song song) {
		this.name = name;
		this.song = song;
	}
	
	// Method
	public void output() {
		System.out.println("가수 이름=" + name);
		song.output();
	}
	
}
