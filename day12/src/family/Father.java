package family;

public class Father extends Family implements Job {
	public Father() {
		super();
	}

	public Father(String name) {
		super(name); //아빠의 이름을 가지고 올라간다
	}
	@Override
	public String work() {
		return "아빠는 나가서 일을 한다\n";
	}
	@Override
	public String toString() {
		return super.toString()+work(); //부모클래스꺼를 가지고 와서 하니까 super
	}
	
}
