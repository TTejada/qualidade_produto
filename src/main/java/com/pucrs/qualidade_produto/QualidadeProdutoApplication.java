package com.pucrs.qualidade_produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class QualidadeProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualidadeProdutoApplication.class, args);

		Scanner scan = new Scanner(System.in);
		AreaCirculo ac = new AreaCirculo();

		double raio = scan.nextDouble();
		String area = ac.calculaArea(raio);
		System.out.println(area);
	}

}
