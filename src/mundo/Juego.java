package mundo;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Juego {

	private String turnoX = "x";
	private String turnoO = "0";
	private JLabel[][] arreglo = new JLabel[3][3];
	private int matrizGandora[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 }, { 1, 5, 9 },
			{ 3, 5, 7 } };
	private boolean estado = true;
	
	public Juego(String turnoX, String turnoO, JLabel[][] arreglo, int[][] matrizGandora, boolean estado) {
		super();
		this.turnoX = turnoX;
		this.turnoO = turnoO;
		this.arreglo = arreglo;
		this.matrizGandora = matrizGandora;
		this.estado = estado;
	}
	
	public Juego() {

	}
	
	public void agregarJLabel(JLabel c1, JLabel c2,JLabel c3,JLabel c4,JLabel c5, JLabel c6, JLabel c7, JLabel c8, JLabel c9) {
		arreglo[0][0] = c1;
		arreglo[0][1] = c2;
		arreglo[0][2] = c3;
		arreglo[1][0] = c4;
		arreglo[1][1] = c5;
		arreglo[1][2] = c6;
		arreglo[2][0] = c7;
		arreglo[2][1] = c8;
		arreglo[2][2] = c9;

	}
	
	public void limpiar() {
		for (int x = 0; x < arreglo.length; x++) {
			for (int y = 0; y < arreglo[x].length; y++) {
				arreglo[x][y].setText("");
				arreglo[x][y].setBackground(Color.WHITE);
				estado = true;
			}
		}
	}
	
	public void presionar(int casilla, int otracasilla) {
		if (arreglo[casilla][otracasilla].getText().equals("") && estado) {
			arreglo[casilla][otracasilla].setText(turnoX);
			cambiarTurno();
			comprobarGanador();
		}
	}
	
	public void cambiarTurno() {
		if (turnoX.equals("x")) {
			turnoX = "o";
			estado = true;
		} else {
			turnoX = "x";
			estado = true;
		}
	}
	
	public void comprobarGanador() {
		for (int i = 0; i < matrizGandora.length; i++) {
			if (arreglo[matrizGandora[i][0]][matrizGandora[i][1]].getText().equals("x")
					&& arreglo[matrizGandora[i][2]][0].getText().equals("x")) {
				arreglo[matrizGandora[i][0]][matrizGandora[i][1]].setBackground(Color.green);
				arreglo[matrizGandora[i][2]][0].setBackground(Color.green);
				JOptionPane.showMessageDialog(null, "Gano X");
				estado = false;
			} else if (arreglo[matrizGandora[i][0]][matrizGandora[i][1]].getText().equals("o")
					&& arreglo[matrizGandora[i][2]][0].getText().equals("o")) {
				arreglo[matrizGandora[i][0]][matrizGandora[i][1]].setBackground(Color.green);
				arreglo[matrizGandora[i][2]][0].setBackground(Color.green);
				JOptionPane.showMessageDialog(null, "Gano O");
				estado = false;
			}else {
				JOptionPane.showMessageDialog(null, "Empate");
			}
		}
	}



	public String getTurnoX() {
		return turnoX;
	}

	public void setTurnoX(String turnoX) {
		this.turnoX = turnoX;
	}

	public String getTurnoO() {
		return turnoO;
	}

	public void setTurnoO(String turnoO) {
		this.turnoO = turnoO;
	}

	public JLabel[][] getArreglo() {
		return arreglo;
	}

	public void setArreglo(JLabel[][] arreglo) {
		this.arreglo = arreglo;
	}

	public int[][] getMatrizGandora() {
		return matrizGandora;
	}

	public void setMatrizGandora(int[][] matrizGandora) {
		this.matrizGandora = matrizGandora;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}
