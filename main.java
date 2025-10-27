public class Main{
    public static void main(String[] args){
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.adicionarTexto("Olá, ");
        historico.salvar(editor.salvar());

        editor.adicionarTexto("Caio");
        historico.salvar(editor.salvar());

        editor.adicionarTexto("!");
        historico.salvar(editor.salvar());

        editor.mostrarTexto();

        editor.restaurar(historico.desfazer());
        editor.mostrarTexto();


    }
}
