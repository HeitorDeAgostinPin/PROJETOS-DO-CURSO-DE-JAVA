package basico;

public /*final*/ class ContaCorrente extends Conta{
     private Double taxaJuros;
     
     public ContaCorrente() {super();}
     
     public ContaCorrente(Integer n,String titular,Double saldo,Double taxaJuros)
     {
    	 super(n,titular,saldo);
    	 this.taxaJuros = taxaJuros;
     }
     
     public Double getTaxaJuros() {return taxaJuros;}
     public void setTaxaJuros(Double taxaJuros) {this.taxaJuros = taxaJuros;}
     
     public void atualizarSaldo() 
     {
    	saldo = saldo * taxaJuros; 
     }
     
     @Override
     public void  saque(double valor) 
     {
 	  saldo = saldo - valor;//sem a taxa agora
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
