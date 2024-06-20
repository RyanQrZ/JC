package validate;

/*
 * This class contains a method to verify string operation.
 */

public class MathCalc {

	public static double math( String operationText ) {

		String inputFormatted[] = operationText.split( " " );

		// Parse string to double

		double n1 = Double.parseDouble( inputFormatted[ 0 ] );
		double n2 = Double.parseDouble( inputFormatted[ 2 ] );

		// Determine which operation

		if ( inputFormatted[ 1 ].equals( "+" ) ) {

			return operation.Calc.add( n1, n2 );

		} // end if
		else if ( inputFormatted[ 1 ].equals( "-" ) ) {

			return operation.Calc.sub( n1, n2 );

		} // end else if
		else if ( inputFormatted[ 1 ].equals( "/" ) ) {

			return operation.Calc.div( n1, n2 );

		} // end else if
		else if ( inputFormatted[ 1 ].equals( "*" ) ) {

			return operation.Calc.mult( n1, n2 );

		} // end else if
		else if ( inputFormatted[ 1 ].equals( "^" ) ) {

			return operation.Calc.jpow( n1, n2 );

		} // end else if
		
		else {
			return -0;
		}

	}

}
