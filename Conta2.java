package provalpoo2;

public abstract class Conta2 {
	public String numero;
	public String agencia;
	public String nomeagencia;
	public String nome;
	public double saldo;
	public String cpf;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeagencia() {
		return nomeagencia;
	}
	public void setNomeagencia(String nomeagencia) {
		this.nomeagencia = nomeagencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract void realizadeposito(double deposito);
	
	public abstract void realizasaque(double saque);
	
	public abstract void renderjuros();

}
