package entities;

import java.util.ArrayList;

public class Aluno {
	protected String nome;
	protected String id;
	protected int idade;
	protected double peso;
	protected double altura;
	ArrayList<Aluno> aluno =  new ArrayList();
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String id, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.id = id;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		aluno = new ArrayList();
		
	}
	public double calculoImc(double peso,double altura) {
		return (peso/(altura*altura));
	}
	public void addAluno(Aluno aluno) {
		aluno.addAluno(aluno);
	}
	public void exbirAlunos() {
		for(Aluno al : aluno) {
			System.out.println("Nome: " + al.getNome());
		}
	}
	public void exibirDados() {
		System.out.println("=== Gym Academias ===");
		System.out.println("----- Ficha do Aluno -----");
		System.out.println("Nome: " + getNome());
		System.out.println("Id: " + getId());
		System.out.println("Idade: " + getIdade());
		System.out.println("Imc: " + calculoImc(peso, altura));
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
