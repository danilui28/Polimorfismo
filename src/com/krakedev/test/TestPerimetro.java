package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Triangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado("Cubo", "Rojo", 5);
		Triangulo triangulo = new Triangulo("Cono", "Amarillo", 4, 8);
		
		int periCuadrado = cuadrado.calcularPerimetro();
		int periTriangulo = triangulo.calcularPerimetro();
		
		System.out.println(periCuadrado);
		System.out.println(periTriangulo);

	}

}
