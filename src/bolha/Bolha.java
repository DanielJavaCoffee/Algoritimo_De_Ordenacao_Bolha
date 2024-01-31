package bolha;

public class Bolha {

	public static void bolhaVersaoRuim(int[] vetor) { // O(n2) + C

		for (int j = 1; j <= vetor.length; j++) {
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					int auxiliar = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = auxiliar;
				} // end if
			} // end for
		} // end for
	} // end void

	public static void bolhaVersaoMelhor(int[] vetor) {

		int n = vetor.length;
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < n - j; i++) {
				if (vetor[i] > vetor[i + 1]) {
					tmp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = tmp;
					swapped = true;
				} // end if
			} // end for
		} // end while
	} // end void
} // end class
