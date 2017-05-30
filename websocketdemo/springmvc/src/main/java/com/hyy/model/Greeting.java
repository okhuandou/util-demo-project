package com.hyy.model;

public class Greeting {
	private String content;
	private String name;

	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

	@Override
	public String toString() {
		return "Greeting [content=" + content + ", name=" + name + "]";
	}
    
}
