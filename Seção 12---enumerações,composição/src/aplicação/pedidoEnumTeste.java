package aplicação;

import java.util.Date;

import entidades.PedidoEnum;
import entidades.enums.Status_do_Pedido;

public class pedidoEnumTeste {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		PedidoEnum pedido = new PedidoEnum(1080, new Date(), Status_do_Pedido.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		Status_do_Pedido sp1 = Status_do_Pedido.ENTREGUE; 
		Status_do_Pedido sp2 = Status_do_Pedido.valueOf("ENTREGUE");
		
		System.out.println(sp1);
		System.out.println(sp2);


	}

}
