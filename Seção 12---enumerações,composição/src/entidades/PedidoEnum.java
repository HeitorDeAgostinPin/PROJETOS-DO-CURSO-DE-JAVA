package entidades;

import java.util.Date;

import entidades.enums.Status_do_Pedido;

public class PedidoEnum 
{

	private Integer id;
    private Date momento;
    private Status_do_Pedido status;
	
public PedidoEnum()
     {}

public PedidoEnum(Integer id, Date momento, Status_do_Pedido status) {
	
	this.id = id;
	this.momento = momento;
	this.status = status;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Date getMomento() {
	return momento;
}

public void setMomento(Date momento) {
	this.momento = momento;
}

public Status_do_Pedido getStatus() {
	return status;
}

public void setStatus(Status_do_Pedido status) {
	this.status = status;
}

@Override
public String toString() {
	return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
}



}
