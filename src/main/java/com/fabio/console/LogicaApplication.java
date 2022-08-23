package com.fabio.console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
				
		BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
		System.out.println("===== [ Olá turma 2 Java IBM ] =======");
		
		List nomes = new ArrayList<>();

		String nome = "";
		for (int i=0; i <5;i++ ){
			System.out.println("Digite um nome:");
			nome = reader.readLine();
			nomes.add(nome);
		}	

		System.out.println("Os nomes digitados foram: ");


		for (int i=0; i <6;i++ ){
			System.out.println(nomes.get(i));
		}

		//SpringApplication.run(LogicaApplication.class, args);
	}

}
