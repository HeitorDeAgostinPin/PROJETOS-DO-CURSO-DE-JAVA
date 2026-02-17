package Model.Serviços;

public class ConcretePrinter extends Device implements Interface_Printer{

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
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