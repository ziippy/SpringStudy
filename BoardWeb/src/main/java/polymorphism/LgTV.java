package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	
	@Autowired
	//@Qualifier("sony")
	//Autowired
	//applicationContext.xml
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
