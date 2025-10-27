public class TextoMemento{ //Vai criar o memento, armazenando o estado atual do texto
    private final String estado;

    public TextoMemento(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }
}
