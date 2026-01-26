package Model.Execeções;

public class DomainExcepition extends Exception {
    private static final long serialVersionUID = 1L;
	
    public DomainExcepition(String msg) {
    	super(msg);
    }
}
