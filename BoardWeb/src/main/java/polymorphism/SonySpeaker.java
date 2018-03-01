package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
//�ٸ� Ŭ�������� Speaker �� ���ؼ� Autowired�� ������ �� ��쿡�� Ŭ������ ������ @Component �� �����ϰ�
//applicationContext.xml �� �ٸ� �۾��� �ؾ� �Ѵ�.
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("SonySpeaker - ��ü ����");
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

