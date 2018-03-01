package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV - 按眉 积己");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV - 按眉 积己 (with speaker)");
		
		this.speaker = speaker;
		this.price = 0;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV - 按眉 积己 (with speaker, price: " + price +")");
		
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("SamsungTV - speaker 汲沥");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("SamsungTV - price 汲沥 (" + price + ")");
		this.price = price;
	}

	public void initMethod() {
		System.out.println("SamsungTV - 按眉 檬扁拳 累诀 贸府");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV - 按眉 昏力 傈 贸府且 肺流 贸府");
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
