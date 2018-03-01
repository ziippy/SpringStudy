package polymorphism;

import org.springframework.stereotype.Component;

// component-scan 에 의해 로딩되도록 @Component 어노테이션 설정
// 단, 기본 생성자가 있어야지만 컨테이너가 객체를 생성할 수 있음
//@Component  -> 이 경우 bean 명은 samsungTV 로 된다.
//@Component("tv")
@Component
public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV - 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV - 객체 생성 (with speaker)");
		
		this.speaker = speaker;
		this.price = 0;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV - 객체 생성 (with speaker, price: " + price +")");
		
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("SamsungTV - speaker 설정");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("SamsungTV - price 설정 (" + price + ")");
		this.price = price;
	}

	public void initMethod() {
		System.out.println("SamsungTV - 객체 초기화 작업 처리");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV - 객체 삭제 전 처리할 로직 처리");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV - power on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV - power off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV - volume up");
		
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV - volume down");
		
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
}
