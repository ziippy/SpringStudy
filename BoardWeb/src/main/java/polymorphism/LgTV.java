package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	
	@Autowired
	//@Qualifier("sony")	만약 Speaker 에 해당하는 bean 이 여러 개 있을 경우에는 이를 이용하여 1개가 지정되도록 한다.
	//Autowired만 쓰고자 할 경우에는 SonySpeaker, AppleSpeaker 클래스에 설정된 @Component 를 삭제하고
	//applicationContext.xml 에 다른 작업을 해야 한다.
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV - 객체 생성");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV - power on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV - power off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV - volume up");
		
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV - volume down");
		
		speaker.volumeDown();
	}

}
