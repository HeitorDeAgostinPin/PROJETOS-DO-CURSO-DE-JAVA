package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente 
{
  private String nomeCliente;
  private String email;
  private Date dataDeAniversario;

  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  
public Cliente() {}

public Cliente(String nomeCliente,String email,Date dataDeAniversario) 
{
	
	this.nomeCliente = nomeCliente;
	this.email = email;
	this.dataDeAniversario = dataDeAniversario;
}

public String getNomeCliente() {return nomeCliente;}
public void setNomeCliente(String nomeCliente) {this.nomeCliente = nomeCliente;}

public String getEmail() {return email;}
public void setEmail(String email) {this.email = email;}

public Date getDataDeAniversario() {return dataDeAniversario;}
public void setDataDeAniversario(Date dataDeAniversario) {this.dataDeAniversario = dataDeAniversario;}

@Override
public String toString() {
	return "Cliente [nomeCliente=" + nomeCliente + ", email=" + email + ", dataDeAniversario=" + sdf.format(dataDeAniversario)
			+ "]";
}



}
/* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date()
*/