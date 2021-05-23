package spring5_web_mvc_study.survey;

import java.util.List;

public class Question {
	private String title;
	private List<String> options;
	
	
	public Question(String title) {
		super();
		this.title = title;
	}


	public Question(String title, List<String> options) {
		super();
		this.title = title;
		this.options = options;
	}


	public String getTitle() {
		return title;
	}


	public List<String> getOptions() {
		return options;
	}
	
	public boolean isChoice() {
		return options != null&&!options.isEmpty();
	}
}
