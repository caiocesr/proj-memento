//Originator: cria ou/e restaura os mementos

public class EditorTexto {
    private String texto = "";

    public void adicionarTexto(String novoTexto){ 
        texto += novoTexto;
    }

    public TextoMemento adicionarMemento(){  
        return new TextoMemento(texto);
    }

    public void restaurar(TextoMemento memento){ 
        texto = memento.getEstado();
    }

    public void mostrarTexto(){ 
        System.out.println("Texto atual: " + texto);
    }
}
