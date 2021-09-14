package com.pucrs.qualidade_produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class QualidadeProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualidadeProdutoApplication.class, args);
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();

		AreaCirculo ac = new AreaCirculo();

		System.out.println(ac.calculaArea(raio));
	}

}
