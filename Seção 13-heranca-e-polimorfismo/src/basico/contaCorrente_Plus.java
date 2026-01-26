package basico;

public class contaCorrente_Plus extends ContaCorrente {

	@Override
    public void saque(double valor) 
    {
	  saldo = saldo - valor + 2;    }
}
