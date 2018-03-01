package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
//다른 클래스에서 Speaker 에 대해서 Autowired만 쓰고자 할 경우에는 클래스에 설정된 @Component 를 삭제하고
//applicationContext.xml 에 다른 작업을 해야 한다.
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
