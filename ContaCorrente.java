package provalpoo2;

public class ContaCorrente extends Conta2 {
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
	public ContaCorrente(String numero,String agencia,String nomeagencia,String nome,double saldo,String cpf) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeagencia = nomeagencia;
		this.nome = nome;
		this.saldo = saldo;
		this.cpf = cpf;
	}
	
	public  void realizadeposito(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	public  void realizasaque(double saque) {
		if((this.saldo - saque)>=0) {
			this.saldo = this.saldo - saque;
		}
		
	}
	public void renderjuros() {}

}
