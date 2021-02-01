package br.com.bootcamp.Telefone;

public enum TipoTelefone {
    COMERCIAL("Numero Comercial"),
    RESIDENCIAL("Numero Residencial"),
    CELULAR("Numero Celular");
    private String informacao;
    TipoTelefone(String informacao){
        this.informacao = informacao;
    }

    public String getInformacao() {
        return informacao;
    }
}

