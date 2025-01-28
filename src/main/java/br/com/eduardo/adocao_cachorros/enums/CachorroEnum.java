package br.com.eduardo.adocao_cachorros.enums;

public enum CachorroEnum {
    FEMEA(1), MACHO(2);

    private int value;

    CachorroEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
