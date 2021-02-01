package br.com.bootcamp.Telefone;

public class Telefone {
    private TipoTelefone tipoTelefone;
    private Integer ddd;
    private Integer numero;

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public Integer getDdd() {
        return ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        if (tipoTelefone != null){
            return "telefone(" + "tipoTelefone"+ tipoTelefone.getInformacao()+", ddd=" + ddd + ", numero"+numero+ ")";
        }
        return "Telefone{" +
                "tipoTelefone=" + tipoTelefone.getInformacao() +
                ", ddd=" + ddd +
                ", numero=" + numero +
                '}';
    }
}

