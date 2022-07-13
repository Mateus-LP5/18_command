public class FuncaoDesfavoritarMusica implements Funcao {

    private Musica musica;

    public FuncaoDesfavoritarMusica(Musica musica) {
        this.musica=musica;
    }

    @Override
    public void executar() {
        this.musica.desfavoritar();
    }

    @Override
    public void cancelar() {
        this.musica.favoritar();
    }
}
