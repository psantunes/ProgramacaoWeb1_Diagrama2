package diagrama2.produtos;

import diagrama2.util.Data;

public class Medicamento {
    private double valor;
    private String principioAtivo;
    private Data dataPrescricao;

    public Medicamento(double valor, String principioAtivo, Data dataPrescricao) {
        this.valor = valor;
        this.principioAtivo = principioAtivo;
        this.dataPrescricao = dataPrescricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public Data getDataPrescricao() {
        return dataPrescricao;
    }

    public void setDataPrescricao(Data dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }

    @Override
    public String toString() {
        return "Medicamento: " + principioAtivo + ". Valor: " + valor + ". Data da Prescrição: " + dataPrescricao;
    }
}
