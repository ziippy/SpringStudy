package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	
	@Autowired
	//@Qualifier("sony")	���� Speaker �� �ش��ϴ� bean �� ���� �� ���� ��쿡�� �̸� �̿��Ͽ� 1���� �����ǵ��� �Ѵ�.
	//Autowired�� ������ �� ��쿡�� SonySpeaker, AppleSpeaker Ŭ������ ������ @Component �� �����ϰ�
	//applicationContext.xml �� �ٸ� �۾��� �ؾ� �Ѵ�.
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV - ��ü ����");
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
