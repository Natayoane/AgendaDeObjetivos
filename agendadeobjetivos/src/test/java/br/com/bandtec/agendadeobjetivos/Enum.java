package br.com.bandtec.agendadeobjetivos;

public enum Enum {

    UM_EXEMPLO("eu sou um exemplo de enum"),
    OUTRO_EXEMPLO("eu sou outro exemplo");

    private String texto;

    private Enum(String texto) {
        this.texto = texto;
    }
}
