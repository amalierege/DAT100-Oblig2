package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main (String [] args) {

// a - skrive ut matrise
		
		int [] [] matrise1 = { 
			{ 1, 2, 0 }, 
			{ 3, 4, 0 }, 
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
		};
		
		skrivUt (matrise1);
		pause ();
		
// b - gjøre matrise om til streng
		
		int [] [] matrise2 = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		String streng = tilStreng (matrise2);
		System.out.print (streng);
		pause ();
	
// c - ny matrise hvor alle tall er multiplisert med parameteren
		
		int [] [] skalertMatrise = skaler (10, matrise2);
		skrivUt (skalertMatrise);
		pause ();
		
// d - sjekke om to matriser er lik hverandre
		
		boolean lik1 = erLik (matrise1, matrise2);
		System.out.println (lik1);
		
		boolean lik2 = erLik (matrise1, matrise1);
		System.out.println (lik2);
		
		boolean lik3 = erLik (matrise2, matrise2);
		System.out.println (lik3);
		
		pause ();
		
// e - speile en matrise diagonalt
		
		int [] [] speilt = speile (matrise2);
		skrivUt (speilt);
		pause ();
		
// f - multiplisere to matriser
		
		int [] [] multiplisert = multipliser (matrise2, matrise2);
		skrivUt (multiplisert);
		pause ();
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.println ("[");
		
		for (int [] array : matrise) {
			
			for (int item : array) {
				System.out.print (" " + item);
			}
			
			System.out.println();
		}
		
		System.out.println ("]");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String streng = "";
		
		for (int [] array : matrise) {
			
			for (int item : array) {
				streng += item + " ";
			}
			
			streng += "\n";
		}

		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [] [] skalert = new int [matrise.length] [matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			
			int [] row = matrise [i];
			
			for (int ii = 0; ii < row.length; ii++) {
				
				skalert [i] [ii] = row [ii] * tall;
			}
		}
		
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		int ay = a.length;
		int ax = a[0].length;
		int by = b.length;
		int bx = b[0].length;
		
		if (ay != by || ax != bx) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int ii = 0; ii < a[0].length; ii++) {
				
				if (a [i] [ii] != b [i] [ii]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int [] [] speilt = new int [matrise[0].length] [matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int ii = 0; ii < matrise[0].length; ii++) {
				
				speilt [ii] [i] = matrise [i] [ii];
			}
		}
		
		return speilt;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		if (a[0].length != b.length) {
			throw new IllegalArgumentException();
		}
		
		int x = b[0].length;
		int y = a.length;
		int z = b.length;
		
		int [] [] multiplisert = new int [x] [y];
		
		for (int i_y = 0; i_y < y; i_y++) {
			
			for (int i_x = 0; i_x < x; i_x++) {
				
				for (int i_z = 0; i_z < z; i_z++) {
					multiplisert [i_y] [i_x] += a [i_y] [i_z] * b [i_z] [i_x];
				}
			}
		}
		
		return multiplisert;
	}
	
	public static void pause () {		
		
		int antall = 15;
		char tegn = '-';
		
		for (int i = 0; i <= antall; i++) {
			System.out.print (tegn);
		}
		System.out.println ();
	}
}
