package Model.Serviços;

public interface Interface_Scanner {
	String scan();

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