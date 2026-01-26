package sobreEnum;

// Definindo um enum chamado DiaDaSemana
enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class estruturaBasica {
    public static void main(String[] args) {
        // Criando uma variável do tipo enum
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

        // Usando switch para tomar decisões com base no enum
        switch (hoje) {
            case SEGUNDA:
                System.out.println("Começo da semana!");
                break;
            case SEXTA:
                System.out.println("Sextou!");
                break;
            case DOMINGO:
                System.out.println("Dia de descanso.");
                break;
            default:
                System.out.println("Dia comum.");
        }

        // Percorrendo todos os valores do enum
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println("Dia: " + dia);
        }
    }
}