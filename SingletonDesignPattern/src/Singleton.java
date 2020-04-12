import java.io.ObjectStreamException;

public class Singleton implements Cloneable {

	//Volatile objects are assigned to a variable after fully instantiated. 
	//This way partial instantiation is restricted
	
	private static volatile Singleton soleInstance = null;
						//new Singleton(); Eager loading : Sometimes while class loading if 
						//We fail to instantiate the class, we have no way to do it latter, so 
						//lazy loading is better
	
	//Solution to reflection
	private Singleton() {
		if( soleInstance != null ) {
			throw new RuntimeException("Please use getInstance");
		}
	}
	
	//Case - Sometimes, if a thread is in the process of instantiation, and when the object is partially instantiated,
	//another thread get the lock and find that soleInstance == null and get the partially instantiated object. 
	//This is solved by VOLATILE keyword
	
	public static Singleton getInstance() {
		if( soleInstance == null ) {
			synchronized (soleInstance) {
				if( soleInstance == null ) {//Double checking
					soleInstance = new Singleton();//Lazy loading is prefered
				}
			}
		}
		return soleInstance;
	}
	
	/*
	 * 
	 * The difference is in which lock is being acquired:
	 * 
	 * synchronized method acquires a lock on the whole object. This means no other
	 * thread can use any synchronized method in the whole object while the method
	 * is being run by one thread.
	 * 
	 * synchronized blocks acquires a lock in the object between parentheses after
	 * the synchronized keyword. Meaning no other thread can acquire a lock on the
	 * locked object until the synchronized block exits.
	 * 
	 * public static synchronized Singleton getInstance() { 
	 * if( soleInstance == null) { 
	 * 		soleInstance = new Singleton();//Lazy loading is prefered 
	 * } return soleInstance; 
	 * }
	 */
	
	//Solution to cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if( soleInstance !=null ) {
			throw new CloneNotSupportedException("Please use getInstance to instatiate the object");
		}
		return soleInstance;
	}
	
	//Implementing readResolve() to soleve serialization/deserialization problem
	public Object readResolve() throws ObjectStreamException{
		return soleInstance;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
	}
}
