package com.example.gof.behavioral.memento.memento;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString(exclude = "articleMemento")
public class Article {

	private long id;
	private @Getter String title;
	private @Getter String content;

	private List<ArticleMemento> articleMemento = new ArrayList<>();

	public Article(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	private ArticleMemento createMemento() {
		ArticleMemento m = new ArticleMemento(id, title, content);
		return m;
	}

	public void restore() {

		if (articleMemento.size() > 0) {
			ArticleMemento m = articleMemento.get(articleMemento.size() - 1);
			articleMemento.remove(articleMemento.size() - 1);
			this.id = m.getId();
			this.title = m.getTitle();
			this.content = m.getContent();
		}
	}

	public void setTitle(String title) {
		articleMemento.add(this.createMemento());

		this.title = title;
	}

	public void setContent(String content) {
		articleMemento.add(this.createMemento());

		this.content = content;
	}

	@ToString
	public class ArticleMemento {

		private @Getter final long id;
		private @Getter final String title;
		private @Getter final String content;

		public ArticleMemento(long id, String title, String content) {
			super();
			this.id = id;
			this.title = title;
			this.content = content;
		}
	}
}