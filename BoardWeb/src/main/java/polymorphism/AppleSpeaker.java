package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
//�ٸ� Ŭ�������� Speaker �� ���ؼ� Autowired�� ������ �� ��쿡�� Ŭ������ ������ @Component �� �����ϰ�
//applicationContext.xml �� �ٸ� �۾��� �ؾ� �Ѵ�.
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("AppleSpeaker - ��ü ����");
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