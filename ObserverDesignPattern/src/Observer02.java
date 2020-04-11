
public class Observer02 implements IObserver {

	private Youtube youtube = new Youtube();
	
	@Override
	public void update() {
		System.out.println("Observer2 notified");
		
	}

}
