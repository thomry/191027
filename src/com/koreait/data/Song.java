package com.koreait.data;

public class Song {

	// Field
	private String title;
	private String genre;
	
	// Constructor
	public Song(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	// Method
	public void output() {
		System.out.println("제목=" + title);
		System.out.println("장르=" + genre);
	}
		
}
