package Model.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Model.Execeções.DomainExcepition;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkin;
	private Date checout;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
	
	public Reserva() {}

	public Reserva(Integer numeroQuarto, Date checkin, Date checout) throws DomainExcepition{
		
		if (!checout.after(checkin)) {// testa se uma data é depois da outra
			throw new DomainExcepition(  "Error in reservation: Reservation dates for updatemust be future dates\r\n" + "");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checout = checout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}
	
	public Date getChecout() {
		return checout;
	}

	public long  duracao() {
		long dif = checout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(dif,TimeUnit.MILLISECONDS);//converte o valor em miliseguendos de dif para dias
	}
	
	public void upDate(Date checkin,Date checout) throws DomainExcepition {
		
		
		Date now = new Date();

		if (checkin.before(now) || checout.before(now)) {
			throw new DomainExcepition("Error in reservation: Reservation dates for updatemust be future dates\r\n" + "");
		} // se a dat de checout não for posterior a de checkin
		if (!checout.after(checkin)) {// testa se uma data é depois da outra
			throw new DomainExcepition(  "Error in reservation: Reservation dates for updatemust be future dates\r\n" + "");
		}
		
		this.checkin = checkin;
		this.checout = checout;
		
	}
	
	@Override
	public String toString() {
		return "Quarto " + numeroQuarto
				+ ",checkin: "
				+ sdf.format(checkin)
				+ ", checou: "
				+sdf.format(checout)
				+", "
				+ duracao()
				+"Noites";
	}
}
/*
 Fazerumprogramaparalerosdadosdeumareservadehotel(númerodoquarto,data
deentradaedatadesaída)emostrarosdadosdareserva, inclusivesuaduraçãoem
dias. Emseguida, lernovasdatasdeentradaesaída, atualizarareserva, emostrar
novamenteareservacomosdadosatualizados.Oprogramanãodeveaceitardados
inválidosparaareserva,conformeasseguintesregras:-Alteraçõesdereservasópodemocorrerparadatasfuturas-Adatadesaídadevesermaiorqueadatadeentra
 
*/