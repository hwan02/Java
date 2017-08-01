package my.entity;

public class Superman extends Human implements Flyer{
	@Override
	public void fly(){
		System.out.println("¸ÁÅä¸¦ ÆŞ·°ÀÌ¸ç ³­´Ù...");
	}
	@Override
	public void eat(){
		super.eat();
		System.out.println("»§µµ ¸Ô´Â´Ù...");

	}
}
