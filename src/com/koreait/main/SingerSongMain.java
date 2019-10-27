package com.koreait.main;

import com.koreait.data.Singer;
import com.koreait.data.Song;

public class SingerSongMain {

	public static void main(String[] args) {

		Singer singer = new Singer("adele", new Song("Hello", "발라드"));
		
		singer.output();
		
	}

}
