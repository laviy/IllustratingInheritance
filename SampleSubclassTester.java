
public class SampleSubclassTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object a = new Object();
		SampleSubclass s = new SampleSubclass("Rickey");
		
		// Comparing the toString() methods of superclass and subclass
		System.out.println(a.toString());
		System.out.println(s.toString());
		
		// Testing the changeName() method of our subclass
		s.changeName("Ophelia");
		String g = s.sayHello();
		System.out.println(g);		

	}

}
