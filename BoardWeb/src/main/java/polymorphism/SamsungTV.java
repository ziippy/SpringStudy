package polymorphism;

import org.springframework.stereotype.Component;

// component-scan �� ���� �ε��ǵ��� @Component ������̼� ����
// ��, �⺻ �����ڰ� �־������ �����̳ʰ� ��ü�� ������ �� ����
//@Component  -> �� ��� bean ���� samsungTV �� �ȴ�.
//@Component("tv")
@Component
public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV - ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV - ��ü ���� (with speaker)");
		
		this.speaker = speaker;
		this.price = 0;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV - ��ü ���� (with speaker, price: " + price +")");
		
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("SamsungTV - speaker ����");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("SamsungTV - price ���� (" + price + ")");
		this.price = price;
	}

	public void initMethod() {
		System.out.println("SamsungTV - ��ü �ʱ�ȭ �۾� ó��");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV - ��ü ���� �� ó���� ���� ó��");
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
