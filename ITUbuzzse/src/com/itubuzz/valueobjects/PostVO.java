package com.itubuzz.valueobjects;

public class PostVO {
 
	public int post_id;
	public String post_text;
	public int log_user_id;
	public String log_user_name;
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_text() {
		return post_text;
	}
	public void setPost_value(String post_text) {
		this.post_text = post_text;
	}
	public int getLog_user_id() {
		return log_user_id;
	}
	public void setLog_user_id(int log_user_id) {
		this.log_user_id = log_user_id;
	}
	public String getlog_user_name() {
		return log_user_name;
	}
	public void setlog_user_name(String post_user_name) {
		this.log_user_name = post_user_name;
	}
	public void setPost_text(String post_text) {
		this.post_text = post_text;
	}
	
	
	
}