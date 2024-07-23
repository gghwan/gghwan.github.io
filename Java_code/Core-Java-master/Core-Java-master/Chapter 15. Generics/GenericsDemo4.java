﻿import java.util.*;

public class GenericsDemo4 {
	public static void main(String[] args) {
		Vector <String> names;
		Vector <Integer> scores;
		Vector <Object> obj;
		Vector <?> wild;
		Vector raw;
		names = new Vector <String>();
		scores = new Vector <Integer>();
		//scores = names;                           //compile error
		//obj = names;                                 //compile error
		//obj = (Vector<Object>)names;       //compile error
		wild = names;

		//names = wild;                                 //compile error
		names = (Vector<String>)wild;          //warning message
		raw = names;
		System.out.println("Program is Over...");
	}
}
