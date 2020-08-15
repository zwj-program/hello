package cn.zhang.domain;

public class VIPUser {
	private String id;
	private String username;
	private String password;
	private int age;
	private String projectId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "VIPUser [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", projectId=" + projectId + "]";
	}
	
}
