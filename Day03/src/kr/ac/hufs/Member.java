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
//		"\n: ����, \t ��"
		String allProfile = "��  ��: " + this.name + "\n";
		allProfile = allProfile + "��  ��: " + this.birthYear + "\n";
		allProfile = allProfile + "��  Ī: " + this.nick + "\n";	
		allProfile = allProfile + "�̸���: " + this.email + "\n";
		allProfile = allProfile + "��  ��: " + this.thumbnail + "\n";
		return allProfile;
	}
	
}
