
package org.oracle.trails.driver;


public class DriverVersion18 {
	
	public void Driver() {
		// TODO Auto-generated constructor stub
	}

    public void test_final_modifier() {
    	
        // I thought the final is like the const in C++    

    	// Once a final variable has been assigned, it always contains the same value. 
        // If a final variable holds a reference to an object, then the state of the object 
    	// may be changed by operations on the object, but the variable will always 
        // refer to the same object (this property of final is called non-transitivity[1]).
        final Integer AUTO_BOX_INT = new Integer(7 ); 
        
        
        // AUTO_BOX_INT = new Integer(9);  // this code does not compile becuase AUTO_BOX_INT is 
                                           // a constant and Integer() is immutable.
        
        System.out.println("auto_box " + AUTO_BOX_INT.intValue() );    
        
    }
	

	public static void main(String... args) {

	    DriverVersion18 driver_1_8 = new DriverVersion18();

	    driver_1_8.test_final_modifier();
        
	    System.out.println("Inversion of Control and Dependancy Injection Example" );

	
	
	}  // end of main

}
