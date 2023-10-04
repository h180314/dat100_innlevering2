package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
		
		for (int[] matI: matrise) {   
			System.out.println();
			for (int matII: matI)
				System.out.print(" " + matII);
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		String matS = "";
		for (int[] matI: matrise) {   
			for (int matII: matI) {
				matS += matII;
				matS += " ";

			}
			matS += "\n";
		}
		
		
		return
				matS;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
		int[][] ny_mat;
		int[] tab_temp;
		ny_mat = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			tab_temp = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length; j++) {
			    //System.out.println(matrise[i][j]);
				tab_temp[j] = matrise[i][j] * tall;
				System.out.println(tab_temp[i]);
			}
			ny_mat[i] = tab_temp;
		}
		return
				ny_mat;

	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}