package basico;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//POLIMORFISMO
	    Conta x= new Conta(1020, "Alex",1000.0);
		Conta y= new ContaCorrente(1023,"Maria", 1000.0,0.01);
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());

//TESTANDO SOBREPOSIÇÃO AQUI
		Conta c = new Conta(1001,"Alex",1000.0);
		c.saque(200.0);
		System.out.println(c.getSaldo());
		
		Conta c22 = new ContaCorrente(1002, "Maria", 1000.0, 0.01);
		c22.saque(200);
		System.out.println(c22.getSaldo());
		//===================================================================
		//TESTANDO O SUPER AQUI
		Conta c33 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
		c33.saque(200.0);
		System.out.println(c33.getSaldo());
		//===================================================================

		ContaEmpresarial e = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta c1 = e;
		Conta c2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta c3 = new ContaCorrente(1004, "Ana", 0.0, 0.01);
		//===================================================================
		//DOWCASTING
		
		ContaEmpresarial c4 = (ContaEmpresarial)c2;
		c4.deposito(10000);
		
		//ContaEmpresarial c5 = (ContaEmpresarial)c3; não pode converter sub classes entre si( não normalmente) , 
		//pode de uma superclasse pra uma subclasse ou vice versa 
		
		if(c3 instanceof ContaEmpresarial) 
		{
			ContaEmpresarial c5 = (ContaEmpresarial)c3;
			c5.emprestimo(5555.00);
			System.out.println("emprestimo");
		}
		
		if(c3 instanceof ContaCorrente) 
		{
			ContaCorrente c5 = (ContaCorrente)c3;
			c5.atualizarSaldo();
			System.out.println("saldo atualizado ");
		}
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
