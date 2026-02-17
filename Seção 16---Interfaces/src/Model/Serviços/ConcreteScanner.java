package Model.Serviços;

public class ConcreteScanner extends Device implements Interface_Scanner {
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned content";
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