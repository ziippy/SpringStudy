package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
//다른 클래스에서 Speaker 에 대해서 Autowired만 쓰고자 할 경우에는 클래스에 설정된 @Component 를 삭제하고
//applicationContext.xml 에 다른 작업을 해야 한다.
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("SonySpeaker - 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker - volume up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker - volume down");
	}
}

