package mundo;

public class Arreglos {

	private int[] numeros;

	public Arreglos(int[] numeros) {
		this.numeros = numeros;
	}

	public int[] menorMayor() {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[i]) {
					int anterior = numeros[i];
					int nuevoMenor = numeros[j];
					numeros[i] = nuevoMenor;
					numeros[j] = anterior;
				}
			}
		}

		return numeros;
	}

	public int[] mayorMenor() {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] > numeros[i]) {
					int anterior = numeros[i];
					int nuevoMayor = numeros[j];
					numeros[i] = nuevoMayor;
					numeros[j] = anterior;
				}
			}
		}

		return numeros;
	}

	public int mayor() {
		int mayor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}
	
	public int menor() {
		int menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}
	
	public int seRepite(int[] arrglo) {
		int repetido = 0;
		for (int i = 0; i < arrglo.length; i++) {
			for (int j = i + 1; j < arrglo.length; j++) {
				if (arrglo[j] == arrglo[i]) {
					repetido = arrglo[i];
				}
			}
		}

		return repetido;
	}
	
	public double promedio() {
		double promedio = 0;

		for (int i = 0; i < numeros.length; i++) {
			promedio += numeros[i];
		}

		return promedio / numeros.length;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

}
