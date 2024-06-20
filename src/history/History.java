package history;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * This class writes history operations
 */

public class History {
	
	public static void writeHistory( double number ) {
		
		try {
			
			BufferedWriter writer = new BufferedWriter( new FileWriter( "calculator-history" ) );
			
			writer.write( Double.toString( number ) );
			
			writer.close();
			
		} // end try
		catch( IOException e ) {
			
			System.err.println( "WAS NOT POSSIBLE WRITE HISTORY\n" );
			
		}
		
	}

}
