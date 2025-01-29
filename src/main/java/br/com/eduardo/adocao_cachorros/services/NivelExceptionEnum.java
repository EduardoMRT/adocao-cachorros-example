package br.com.eduardo.adocao_cachorros.services;

public enum NivelExceptionEnum {
    ERRO(0, "Erro"),
    ALERTA(1, "Alerta"),
    INFO(2, "Info");

    private final int value;
    private final String descricao;

    NivelExceptionEnum(int value, String descricao) {
        this.value = value;
        this.descricao = descricao;
    }

    public int getValue() {
        return value;
    }

    public String getDescricao() {
        return descricao;
    }
}
