package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
		int[] tab = tabell;
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		int[] tab = tabell;
		String tabS = "[";
		for (int i = 0; i < tab.length; i++) {
			tabS += tabell[i];
			if (i < tab.length-1 )
				tabS += ",";
		}
		tabS += "]";
		//System.out.println(tabS);
		return
				tabS;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden summer ikke implementert");
		
		//vanlig for-løkke
		int[] tab = tabell;
		int sum = 0;
//		for (int i = 0; i < tab.length; i++) {
//			sum += tab[i];
//		}
		
		//while løkke
//		int i = 0; sum = 0;
//		if (tab.length > 0) {
//			do {
//				sum += tab[i];
//				i++;
//			} while (i < tab.length);
//		}

		
//		//utvidet for-løkke
		sum = 0; 
		for (int tabI: tab)
			sum += tabI;
		
		return
				sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");
		int match = tall;
		int[] tab = tabell;
		int i = 0;
		boolean finnes;
		finnes = false;
		if (tab.length > 0) {
			while (i < tab.length) {
				if (tab[i] == match) {
					finnes = true; break;
				}
				else
					i++;
			}
		}
		return
				finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
		int[] tab = tabell;
		int index = -1;
		int i = 0;
		int tallet = tall;
		boolean finnes;
		if (tab.length > 0) {
			while (i < tab.length) {
				if (tab[i] == tallet) {
					index = i;
					finnes = true; break;
				}
				else
					i++;
			}
		}
			return
					index;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");
		int[] tab = tabell;
		int[] tab_rev;
		tab_rev =  new int[tab.length];
		if (tab.length > 0) {
			for (int i = 0; i < tab.length; i++) {
				tab_rev[i] = tab[tab.length - 1 - i];
				//System.out.println(tab_rev[i]);
			}
		}
		return
				tab_rev;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
		int[] tab = tabell;
		boolean sort = true;
		if (tab.length > 0) {
			for (int i = 1; i < tab.length; i++) {
				if (tab[i] < tab[i-1]) {
					sort = false;
				}
			}
		}
		return
				sort;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
		int[] tab1 = tabell1;
		int[] tab2 = tabell2;
		int[] tab_sammen;
		tab_sammen =  new int[tab1.length + tab2.length];
		int k = 0;
		if (tab1.length > 0) {
			for (int i = 0; i < tab1.length; i++) {
				tab_sammen[i] = tab1[i];
				k++;
				//System.out.println(tab_sammen[i]);
			}
		}
		if (tab2.length > 0) {
			for (int j = 0; j < tab2.length; j++) {
				tab_sammen[k+j] = tab2[j];
				//System.out.println(tab_sammen[k+j]);
			}
		}
			
			
		return
				tab_sammen;
	}
}