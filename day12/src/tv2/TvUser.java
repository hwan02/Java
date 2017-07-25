package tv2;
//다형성을 이용하여 결합도를 낮춘다
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
			System.out.println("어디tv니?");
		}
		tv.powerOn();
		tv.powerOff();
		tv.soundUp();
		tv.soundDown();
	}
}
