public class Main{
    public static void main(String[] args){
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.adicionarTexto("Olá, ");
        historico.adicionarMemento(editor.adicionarMemento());

        editor.adicionarTexto("Caio");
        historico.adicionarMemento(editor.adicionarMemento());

        editor.adicionarTexto("!");
        historico.adicionarMemento(editor.adicionarMemento());

        editor.mostrarTexto();

        editor.restaurar(historico.desfazer());
        editor.mostrarTexto();


    }
}
