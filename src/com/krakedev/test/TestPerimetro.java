package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado("Cubo", "Rojo", 5);
		Rectangulo rectangulo = new Rectangulo("Cono", "Amarillo", 4, 8);
		
		int periCuadrado = cuadrado.calcularPerimetro();
		int periRectangulo = rectangulo.calcularPerimetro();
		
		System.out.println(periCuadrado);
		System.out.println(periRectangulo);

	}

}
