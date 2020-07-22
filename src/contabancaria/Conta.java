package contabancaria;

public class Conta {
	
	private String nome;
	private int numeroConta;
	private double saldo;
	
	public Conta (String nome, int numeroConta) {
		
		this.nome = nome;
		this.numeroConta = numeroConta;
		
	}
	public Conta(String nome, int numeroConta,double saldo) {
		
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		
	}
	public void setNome(String nome) {
	
		this.nome = nome;
		
	}
	public String getNome() {
		
		return nome;
	}
	
	public int getNumeroConta() {
		
		return numeroConta;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
		public double deposito(double saldo) {
			
			return this.saldo += saldo;
		
		}
		public double saque(double saldo) {
			
			return this.saldo -= saldo + 5.0;
		}
		
		
		
	}

