package interfaz;

import java.util.Arrays;

import mundo.Arreglos;

public class Interfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] numeros  = {7,2,4,8,3,9,1,5,10,6};
	int [] numero  = {7,2,3,8,3,9,1,5,10,6};
		
		Arreglos arreglo = new Arreglos(numeros);
		
		System.out.println("Arreglo: " + " " + Arrays.toString(arreglo.getNumeros()));
		System.out.println("Arreglo de menor a mayor: " + " " + Arrays.toString(arreglo.menorMayor()));
		System.out.println("Arreglo de mayor a menor: " + " " + Arrays.toString(arreglo.mayorMenor()));
		System.out.println("Numero mayor: " + " " + arreglo.mayor());
		System.out.println("Numero menor: " + " " + arreglo.menor());
		System.out.println("Numero se repite: " + " " + arreglo.seRepite(numero));
		System.out.println("Promedio de la suma del arrglo: " + " " + arreglo.promedio());

	}

}
