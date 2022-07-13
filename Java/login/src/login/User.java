package login;

public class User {
	// String 타입의 id, pw, name --> private 변수
	private String id;
	private String pw;
	private String name;
	
	
	// 게터와 세터
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; 
	}
}
