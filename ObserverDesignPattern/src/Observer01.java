
public class Observer01 implements IObserver{

	private Youtube youtube = new Youtube();
	
	public Observer01() {
	}
	
	@Override
	public void update() {
		
		System.out.println("Observer1 notified");
	}

}
