package cn.zhang.vo;

import cn.zhang.domain.Project;
import cn.zhang.domain.User;

public class User_Project2 {
	private User user;
	private Project project;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "User_Project2 [user=" + user + ", project=" + project + "]";
	}
		
}
