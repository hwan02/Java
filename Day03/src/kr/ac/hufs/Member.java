package kr.ac.hufs;

public class Member {
	String name = "";
	int birthYear = 0;
	String nick = "";
	String email = "";
	String thumbnail = "";
	
	void setAll(String _name, int _birthYear, String _nick, String _email, String _thumbnail) {
		this.name = _name;
		this.birthYear = _birthYear;
		this.nick = _nick;
		this.email = _email;
		this.thumbnail = _thumbnail;
		
	}
	String getProfile() {
//		"\n: 개행, \t 탭"
		String allProfile = "이  름: " + this.name + "\n";
		allProfile = allProfile + "생  년: " + this.birthYear + "\n";
		allProfile = allProfile + "애  칭: " + this.nick + "\n";	
		allProfile = allProfile + "이메일: " + this.email + "\n";
		allProfile = allProfile + "사  진: " + this.thumbnail + "\n";
		return allProfile;
	}
	
}
