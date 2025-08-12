package application;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 Scanner scn = new Scanner(System.in);
		 int op ;
		 ArrayList<Aluno>aluno = new ArrayList();
		   Locale.setDefault(Locale.US);
		 
		 do {
			 	System.out.println("=== GymAcademias ===");
			 	System.out.println("1- Cadastro de Aluno");
			 	System.out.println("2 - Listar Alunos ");
			 	System.out.println("3 - Relatório Geral ");
			 	System.out.println("======================");
			 	System.out.print("Digite a opção: ");
			 	op = scn.nextInt();
			 	scn.nextLine();
			 	switch (op) {
				case 1:{
						System.out.println("Bem-Vindo ao Cadastro de Aluno");
						System.out.print("Digite seu nome: ");
						String nome = scn.nextLine();
						System.out.print("Digite seu ID: ");
						String id = scn.nextLine();
						System.out.print("Digite sua idade: ");
						int idade = scn.nextInt();
						scn.nextLine();
						System.out.print("Digite seu Peso: ");
						double peso = scn.nextDouble();
						System.out.print("Digite sua altura: ");
						double altura = scn.nextDouble();
						//scn.nextLine();
						Aluno al = new Aluno(nome, id, idade, peso,altura);
						
						aluno.add(al);
						System.out.println("Aluno Cadastrado com Sucesso! Seja bem-vindo a Gym");

						break;
				}case 2:{
					System.out.println("=== Lista De Alunos - GymAcademias ===");
					for(Aluno a : aluno) {
						System.out.println("Nome: " + a.getNome());
					}
					break;
				}case 3:{
					System.out.println("=== Relatório Geral - GymAcademias ===");
					for(Aluno a : aluno) {
						a.exibirDados();
					}
					break;
				}case 4:{
					System.out.println("Encerrando o programa....");
					break;
				}
 		    }
		 }while(op != 4);
		 System.out.println("Programa Encerrado! Obrigado por escolher a GymAcademias.");
		

	}

}
