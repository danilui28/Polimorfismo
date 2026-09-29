package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		Figura figura = new Figura("Circulo", "Azul");
		Cuadrado cuadrado = new Cuadrado("Cubo", "Rojo", 5);
		Triangulo triangulo = new Triangulo("Cono", "Amarillo", 3, 5);
		
		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);

	}

}
