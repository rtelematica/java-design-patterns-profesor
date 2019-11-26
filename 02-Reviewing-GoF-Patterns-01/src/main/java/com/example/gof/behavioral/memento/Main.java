package com.example.gof.behavioral.memento;

import com.example.gof.behavioral.memento.memento.Article;

public class Main {

	public static void main(String[] args) {

		Article article = new Article(1, "My article");

		System.out.println(article);

		article.setContent("my content");

		System.out.println(article);

		article.setTitle("other title");

		System.out.println(article);

		article.setContent("my other content");

		System.out.println(article);

		System.out.println("===========");

		article.restore();

		System.out.println(article);

		article.restore();

		System.out.println(article);

		article.restore();

		System.out.println(article);

	}
}
