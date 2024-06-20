package operation;

/*
 * This class contains methods for allowed operations
 */

public class Calc {
	
	// Addition method
	
	public static double add( double n1, double n2 ) {
		return ( n1 + n2 );
	}
	
	// Subtraction method
	
	public static double sub( double n1, double n2 ) {
		return ( n1 - n2 );
	}
	
	// Multiplication method
	
	public static double mult( double n1, double n2 ) {
		return ( n1 * n2 );
	}
	
	// Division method
	
	public static double div( double n1, double n2 ) {
		return ( n1 / n2 );
	}
	
	// Exponential method
	
	public static double jpow( double n1, double n2 ) {
		
		if ( n2 == 0 ) {
			
			return 1;
			
		} // end if
		else if( n2 == 1 ) {
			
			return n1;
			
		} // end else if
		else {
			
			double sum = n1;
			
			for( int i = 1; i < n2; i++ ) {
				sum *= n1;
			}
			
			return sum;
			
		}// end else
	}

}
