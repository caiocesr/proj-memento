import java.util.List;
import java.util.ArrayList;

//Caretaker: Vai gerenciar os mementos
//Se não houver historico, o estado atual será vazio

public class Historico {
    private List<TextoMemento> historico = new ArrayList<>();

    public void adicionarMemento(TextoMemento memento){
        historico.add(memento);
    }

    public TextoMemento desfazer(){
        if(!historico.isEmpty()){
            return historico.remove(historico.size() - 1);
        }
        return new TextoMemento("");
    }
}
