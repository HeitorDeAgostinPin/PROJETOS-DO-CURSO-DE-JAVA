package Model.Execeções;

public class ContaExceção extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ContaExceção(String msg) {
		super(msg);
	}

}
