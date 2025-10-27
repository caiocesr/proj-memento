public class Main{
    public static void main(String[] args){
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.adicionarTexto("Olá ");
        historico.adicionarMemento(editor.adicionarMemento());

        editor.adicionarTexto("Mundo");
        historico.adicionarMemento(editor.adicionarMemento());

        editor.adicionarTexto("!");
        historico.adicionarMemento(editor.adicionarMemento());

        System.out.println("O texto final é: ");
                editor.mostrarTexto();

        editor.restaurar(historico.desfazer());
        System.out.println("Após desfazer o texto 1:");
        editor.mostrarTexto();

        editor.restaurar(historico.desfazer());
        System.out.println("Após desfazer o texto 2:");
        editor.mostrarTexto();

        editor.restaurar(historico.desfazer());
        System.out.println("Após desfazer 3, o texto final fica:");
        editor.mostrarTexto();
    }
}
