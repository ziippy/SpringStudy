package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
////applicationContext.xml
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("AppleSpeaker - 객체 생성");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker - volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker - volume down");
	}

}
