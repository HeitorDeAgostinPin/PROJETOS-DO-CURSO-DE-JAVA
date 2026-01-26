package basico;

public class Conta {
  private  Integer n;
  private String titular;
  protected Double saldo;

  public Conta(){};
  public Conta(Integer n,String titular,Double saldo){this.n = n;this.titular = titular;this.saldo = saldo;}
  
  public  Integer getNumero() {return n;}
  public void setNumero(Integer n) {this.n = n;}
  
  public String getTitular() {return titular;}
  public void setTitular(String titular) {this.titular = titular;}
  
  public Double getSaldo() {return saldo;}
  //public void setSaldo(Double saldo) {this.saldo = saldo;}
  
  public void saque(double valor) 
    {
	  saldo = saldo - (valor + 5.0);
    }
  
  public void deposito(double valor)
   {
	  saldo = saldo + valor;
   }

}
/*1-Suponha um negócio de banco que possui uma conta comum e uma conta para 
empresas, sendo que a conta para empresa possui todos membros da conta 
comum, mais um limite de empréstimo e uma operação de realizar empréstimo.
*/
//2- MAS USANDO UPCASTING E DOWCASTING AGORA
/*3-Suponha que a operação de 
saque possui uma taxa no valor 
de 5.0. Entretanto, se a conta 
for do tipo poupança, esta taxa 
não deve ser cobrada.
Como resolver isso?
Resposta: sobrescrevendo o 
método withdrawna subclasse 
SavingsAccount
*/
/*4-Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o 
saque normalmente da superclasse, e descontar mais 2.0.
*/
/*5-Suponha que você queira evitar que 
sejam criadas subclasses de 
ContaCorrente e Suponha que você não queira que o método Withdraw de 
SavingsAccount seja sobreposto*/
//6-POLIMORFISMO
