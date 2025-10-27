//Originator: cria ou/e restaura os mementos

public class EditorTexto {
    private String texto = "";

    public void adicionarTexto(String novoTexto){ //Vai modificar o estado atual
        texto += novoTexto;
    }

    public TextoMemento salvar(){ //Cria um memento/pega conteúdo da atual variável texto, criando um novo Objeto TextoMemento (salva o texto)
        return new TextoMemento(texto);
    }

    public void restaurar(TextoMemento memento){ //Recebe o texto que foi salvo em "salvar()" para voltar naquele "momento salvo"
        texto = memento.getEstado();
    }

    public void mostrarTexto(){ //Exibe o conteúdo atual
        System.out.println("Texto atual: " + texto);
    }
}
