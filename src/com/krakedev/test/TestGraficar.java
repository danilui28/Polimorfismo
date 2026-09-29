package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		Graficador graficador = new Graficador();
		Figura figura = new Cuadrado("Circulo", "Azul", 5);
		Cuadrado cuadrado = new Cuadrado("Cubo", "Rojo", 4);
		Rectangulo rectangulo = new Rectangulo("Cono", "Amarillo", 8, 8);
		TrianguloRectangulo TrianguloRectangulo = new TrianguloRectangulo("Hola", "Verde", 10, 12);
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(rectangulo);
		graficador.graficar(TrianguloRectangulo);

	}

}
