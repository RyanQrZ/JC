package util;

import java.util.Scanner;

import history.History;
import validate.MathCalc;

public class Main {

	public static void main( String args[] ) {

		Scanner input = new Scanner( System.in );
		
		String text = input.nextLine();
		
		History.writeHistory( MathCalc.math( text ) );
		
		System.out.println( MathCalc.math( text ) );

	}

}
