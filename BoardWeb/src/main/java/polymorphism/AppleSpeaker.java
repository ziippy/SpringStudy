package polymorphism;

public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("AppleSpeaker - °´Ã¼ »ý¼º");
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
