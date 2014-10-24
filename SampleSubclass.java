/**
 * An object that can be assigned a nickname.  Template showing how subclasses can
 * be used to extend the functionality of an existing class -- in this case, Object.
 * 
 * Also, this class overrides (redefines) the behavior of one method in its superclass
 * by providing a new implementation.  Rather than accept the "Object" way of performing
 * the toString() method, this new subclass provides its own way of doing toString(). 
 * All other methods of the superclass remain intact.
 * 
 * @author kentcollins
 * @version 24 October, 2014
 *
 */

public class SampleSubclass extends Object {

	private String nickname; // a new data field!  Object does not have this
	
	public SampleSubclass(String n) { // a constructor for this object
		super(); 
		nickname = n; // take the String provided and store it in the 'name' data field
	}
	
	@Override // redefine behavior inherited from the superclass
	public String toString() {
		return nickname;
	}
	
	/**
	 * Create a greeting String
	 * 
	 * @return	a casual greeting
	 */
	public String sayHello() {
		return "Hi.  You can call me "+nickname;
	}
	
	/**
	 * Change the nickname of this particular instance
	 * 
	 * @param newname
	 * 		the new nickname that this instance should hold
	 */
	public void changeName(String newname) {
		nickname = newname;
	}
}
