package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	public static void main (String [] args) {
		
		// a - tabell skriv ut
		int [] tab = {7, 22, 34, 23, 2, 435};
		int [] tab2 = {4, 8, 34543, 234, 5345};
		skrivUt (tab);
		pause ();
		
		// b - tabell om til streng
		String streng = tilStreng (tab);
		System.out.println ("Tabellen din som en tekststreng:\n" + streng);
		pause ();
		
		// c - tabell sum
		int sum1 = summer1 (tab);
		System.out.println ("Summen av tabellen din:\n" + sum1);
		pause ();
		
		int sum2 = summer2 (tab);
		System.out.println ("Summen av tabellen din:\n" + sum2);
		pause ();
		
		int sum3 = summer3 (tab);
		System.out.println ("Summen av tabellen din:\n" + sum3);
		pause ();
		
		// d - finnes tall
		boolean finnes = finnesTall (tab, 23);
		System.out.println ("Tallet 23 er i tabellen:\n" + finnes);
		pause ();
		
		// e - indeks for et tall
		int indeks = (posisjonTall (tab, 3));
		System.out.println ("Tallet ligger i posisjon:\n" + indeks);
		pause ();
		
		// f - tabellen returnert i motsatt rekkefølge
		int [] reversert = (reverser (tab));
		skrivUt (reversert);
		pause ();
		
		// g - er tabellen sortert?
		boolean sortert = erSortert (tab);
		System.out.println (sortert);
		pause ();
		
		// h - to tabeller satt sammen
		int [] sammen = settSammen (tab, tab2);
		skrivUt (sammen);
		pause ();
		
	}

	// a)
	public static void skrivUt (int[] tabell) {

		System.out.println ("Tabellen din:");
		System.out.print ("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println ("]");
	}

	// b)
	public static String tilStreng (int[] tabell) {
			
		String tabellTxt = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			
			tabellTxt += Integer.toString (tabell [i]);
			
			if (i != tabell.length - 1) {
				tabellTxt += ",";
			} 
		}
		
		tabellTxt += "]";
		return tabellTxt;
	}

	// c)
	public static int summer1 (int[] tabell) {
				
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell [i];
		}
		
		return sum;
	}
	
	public static int summer2 (int[] tabell) {
		
		int sum = 0;
		int i = 0;
		
		while (i < tabell.length) {
			
			sum += tabell [i];
			
			i++;
		} 
		
		return sum;
	}
	
	public static int summer3 (int[] tabell) {
		
		int sum = 0;
		
		for (int i : tabell) {
			sum += i;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		int i = 0;
		
		while (i < tabell.length && !finnes) {
			
			if (tabell[i] == tall) {
				finnes = true;
			}
			
			i++;
		}
		
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell [i] == tall) {
				return i;
			}
		} 
		
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] reversertTabell = new int [tabell.length];
		
		for (
				int i = 0, j = tabell.length - 1;
				i < tabell.length;
				i++, j--
		) {
			reversertTabell [j] = tabell [i];
		}
		
		return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i = 1;
		boolean sortert = true; 
		
		while (sortert && i < tabell.length - 1) {
			
			if (tabell [i] > tabell [i + 1]) {
				sortert = false;
			}
			i++;
		}
		
		System.out.println ("Tabellen er sortert:");
		
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] sammen = new int [tabell1.length + tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammen [i] = tabell1 [i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			sammen [i + tabell1.length] = tabell2 [i];
		}
		
		return sammen;
	}
	
	public static void pause () {		
		
		int antall = 38;
		char tegn = '-';
		
		for (int i = 0; i <= antall; i++) {
			System.out.print (tegn);
		}
		System.out.println ();
	}
}
