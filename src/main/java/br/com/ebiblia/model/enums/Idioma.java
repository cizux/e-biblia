package br.com.ebiblia.model.enums;

public enum Idioma {
    HEBRAICO(1, "Hebraico"),
    GREGO(2, "Grego"),
    PORTUGUES(3, "Português"),
    INGLES(4, "Inglês"),
    ESPANHOL(5, "Espanhol"),
    FRANCES(6, "Francês"),
    ALEMAO(7, "Alemão"),
    ITALIANO(8, "Italiano");

    private Integer cod;
	private String desc;

    Idioma(Integer cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public static Idioma toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Idioma x : Idioma.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Idioma inválido: " + cod);
    }
}