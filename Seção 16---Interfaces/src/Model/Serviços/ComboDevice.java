package Model.Serviços;

public class ComboDevice extends Device implements Interface_Scanner,Interface_Printer{


	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

	
}
/*A herança múltipla pod egerar o
problema do diamante: uma
ambiguidade causada pela
existênciadomesmométodoem
maisdeumasuperclasse.
Herança múltipla não é
permitida na maioria das
linguagens
ATENÇÃO:
Isso NÃO é herança múltipla,
poisNÃOHÁREUSOnarelação
entre ComboDevice e as
interfacesScannerePrinter.
ComboDevide não herda, mas
sim implementa as interfaces
(cumpreocontrato)*/