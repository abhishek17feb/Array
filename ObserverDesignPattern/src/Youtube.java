import java.util.ArrayList;
import java.util.List;

public class Youtube {

	private String uploadTitle;
	
	public Youtube() {
	}
	
	public Youtube(String title) {
		this.uploadTitle = title;
	}
	
	private List<IObserver> observers = new ArrayList<>();
	public void subscribe( IObserver observer ) {
		observers.add(observer);
	}
	
	public void unsubscribe(IObserver iObserver ) {
		observers.remove(iObserver);
	}
	
	public void notifySubscriber() {
		for( IObserver ob : observers ) {
			ob.update();
		}
	}
	
	public String getTitle() {
		return uploadTitle;
	}
	
	public static void main(String[] args) {
		Youtube newUpload = new Youtube("Abhishek done observer");
		IObserver ob1= new Observer01();
		IObserver ob2 = new Observer02();
		
		newUpload.subscribe(ob1);
		newUpload.subscribe(ob2);
		
		newUpload.notifySubscriber();
		
	}
}
