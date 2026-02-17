package Model.Serviços;

public abstract class Device {
	public String serialNumber;

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public abstract void processDoc(String doc);
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