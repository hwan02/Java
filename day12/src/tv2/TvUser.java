package tv2;
//�������� �̿��Ͽ� ���յ��� �����
public class TvUser {

	public static void main(String[] args) {
		String com = args[0];
		Tv tv = null;
		
		if(com.equals("LG")|| com.equals("lg"))
		{
			 tv = new LgTv();
			
		} else if(com.equals("SAMSUNG")|| com.equals("samsung")){
			tv = new SamsungTv();
		}else {
			System.out.println("���tv��?");
		}
		tv.powerOn();
		tv.powerOff();
		tv.soundUp();
		tv.soundDown();
	}
}
