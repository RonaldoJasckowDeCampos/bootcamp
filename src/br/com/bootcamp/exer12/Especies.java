package br.com.bootcamp.exer12;

public enum Especies {
    AVES("Aves"),
    MAMIFEROS("Mamíferos"),
    PEIXES("Peixe"),
    REPTEIS("Répteis");
    private String informacao;

    Especies(String informacao) {
        this.informacao = informacao;
    }

    public String getInformacao() {
        return informacao;
    }
}

